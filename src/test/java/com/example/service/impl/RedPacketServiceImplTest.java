package com.example.service.impl;

import com.example.service.RedPacketService;
import com.example.entity.RedPacket;
import org.testng.annotations.Test;

import java.util.List;

public class RedPacketServiceImplTest {

    private RedPacketService service = new RedPacketServiceImpl();

    @Test
    public void generateRedPacket() {
        RedPacket redPacket = service.generateRedPacket(18.00, 5, "this is Red packet");
        System.out.println(redPacket);
    }

    @Test
    public void getMoney() {
        double money = service.getMoney(1);
        System.out.println(money);
    }

    @Test
    public void getRedPacketById() {
        RedPacket redPacketById = service.getRedPacketById(1);
        System.out.println(redPacketById);
    }

    @Test
    public void getAll() {
        List<RedPacket> all = service.getAll();
        for (RedPacket red:all){
            System.out.println(red);
        }
    }

}