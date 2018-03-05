package test.mybatis.Service.Impl;

import test.mybatis.DAO.IRedPacketDAO;
import test.mybatis.FactoryMethod.DatabaseFactory;
import test.mybatis.Service.RedPacketService;
import test.mybatis.entity.RedPacket;
import test.mybatis.utils.RedPacketUtils;

import java.util.List;

public class RedPacketServiceImpl implements RedPacketService {

    private DatabaseFactory factory = new DatabaseFactory();

    private IRedPacketDAO mapper =(IRedPacketDAO) factory.getSqlSession("mybatis-config.xml",IRedPacketDAO.class);

    public RedPacket generateRedPacket(double totalMoney, int number,String description) {
        RedPacket redPacket = new RedPacket();
        redPacket.setLost(totalMoney);
        redPacket.setTotal(totalMoney);
        redPacket.setPacket(number);
        redPacket.setDescription(description);

        int bool = mapper.putRedPacket(redPacket);

        System.out.println(bool);
        return redPacket;
    }

    public double getMoney(int id) {
        RedPacket packet = mapper.getRedPacketById(id);

        if (packet.getPacket() == 0){
            return -1;
        }
        //lost 剩下的钱 packet 剩下多少个
        double money = RedPacketUtils.getRedPacketMoney(packet.getLost(),packet.getPacket());
        mapper.update(money,packet.getId());


        return money;
    }

    public RedPacket getRedPacketById(int id) {
        RedPacket packet = mapper.getRedPacketById(id);
        return packet;
    }

    public List<RedPacket> getAll() {
        List<RedPacket> list = mapper.queryAll();

        return list;
    }

}
