package com.example.service.impl;

import com.example.database.DatabaseFactory;
import com.example.entity.RedPacket;
import com.example.dao.IRedPacketDAO;
import com.example.service.RedPacketService;
import com.example.utils.RedPacketUtils;

import java.util.List;

/**
 * @author eddie
 * @createTime 2018-11-08
 * @description 红包服务实现类
 */
public class RedPacketServiceImpl implements RedPacketService {

    private IRedPacketDAO mapper =(IRedPacketDAO) DatabaseFactory.getSqlSession("mybatis-config.xml",IRedPacketDAO.class);

    public RedPacket generateRedPacket(double totalMoney, int number, String description) {
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
