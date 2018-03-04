package test.mybatis.utils;

import java.util.Random;

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

        result = Math.floor(result*100)/100;

        return result;
    }

}
