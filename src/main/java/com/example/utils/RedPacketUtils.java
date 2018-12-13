package com.example.utils;

import java.util.Random;

/**
 * 红包算法
 * @date 2018-04-22
 * @author Eddie Lee
 */
public class RedPacketUtils {

    public static double getRedPacketMoney(double money,int packetNumber){
        if (packetNumber == 1){
            return money;
        }
        Random random = new Random();

        double min = 0.01;
        double result = money / packetNumber * 2;
        result = random.nextDouble()*result;
        result = result <= min ? min:result;
        return result;
    }

}
