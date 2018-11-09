package com.example.service;

import com.example.entity.RedPacket;

import java.util.List;

/**
 * @author eddie
 * @createTime 2018-11-08
 * @description 红包接口类
 */
public interface RedPacketService {

    /**
     * 生成一个红包
     * @param totalMoney
     * @param number
     * @param description
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
     * 获取所有红包
     * @return
     */
    List<RedPacket> getAll();

}
