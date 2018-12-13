package com.example;

import com.example.dao.RedPacketRegistry;
import com.example.entity.RedPacket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * @author eddie
 * @createTime 2018-12-13
 * @description 启动
 */
public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:application.xml");
        final RedPacketRegistry bean = context.getBean(RedPacketRegistry.class);
        final RedPacket save = bean.save(new RedPacket(1,2.1,2.1,"红包"));
        System.out.println(save);
    }

}
