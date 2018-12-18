package com.example.service.impl;

import com.example.registry.RedPacketRegistry;
import com.example.entity.RedPacket;
import com.example.service.RedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author eddie
 * @createTime 2018-11-08
 * @description 红包服务实现类
 */
@Service
public class RedPacketServiceImpl implements RedPacketService {

    @Autowired
    private RedPacketRegistry redPacketRegistry;

    @Override
    public RedPacket generateRedPacket(double totalMoney, int number, String description) {
        RedPacket redPacket = new RedPacket();
        redPacket.setLost(totalMoney);
        redPacket.setTotal(totalMoney);
        redPacket.setPacket(number);
        redPacket.setDescription(description);

        RedPacket bool = redPacketRegistry.save(redPacket);

        System.out.println(bool);
        return redPacket;
    }

    @Override
    public double getMoney(int id) {
//        RedPacket packet = redPacketRegistry.getOne(id);
//
//        if (packet.getPacket() == 0){
//            return -1;
//        }
//        //lost 剩下的钱 packet 剩下多少个
//        double money = RedPacketUtils.getRedPacketMoney(packet.getLost(),packet.getPacket());
//        redPacketRegistry.(money,packet.getId());
//        return money;

        return 1.1;
    }

    @Override
    public RedPacket getRedPacketById(int id) {
        RedPacket packet = redPacketRegistry.getOne(id);
        return packet;
    }

    @Override
    public List<RedPacket> getAll() {
        List<RedPacket> list = redPacketRegistry.findAll();
        return list;
    }

}
