package test.mybatis.Service;

import test.mybatis.entity.RedPacket;

import java.util.List;

public interface RedPacketService {

    /**
     * 生成一个红包
     * @param totalMoney
     * @param number
     * @return
     */
    RedPacket generateRedPacket(double totalMoney , int number , String description);

    /**
     * 拆红包
     * @param id
     * @return
     */
    double getMoney(int id);

    /**
     * 查询数据库中的红包
     * @param id
     * @return
     */
    RedPacket getRedPacketById(int id);

    /**
     *
     * @return
     */
    List<RedPacket> getAll();

}
