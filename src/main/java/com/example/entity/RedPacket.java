package com.example.entity;

import lombok.Data;

/**
 * @author eddie
 * @createTime 2018-11-08
 * @description 红包实体类
 */
@Data
public class RedPacket {

    private int id;

    private int packet;

    private double total;

    private double lost;

    private String description;
}
