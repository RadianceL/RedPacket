package com.example.DAO;

import com.example.entity.RedPacket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author eddie
 * @createTime 2018-11-08
 * @description 数据库接口类
 */
public interface IRedPacketDAO {

    /**
     * 通过ID获取红包
     * @param id
     * @return
     */
    RedPacket getRedPacketById(int id);

    /**
     * 放入一个红包
     * @param redPacket
     * @return
     */
    int putRedPacket(@Param("redPacket")RedPacket redPacket);

    /**
     * 获取所有
     * @return
     */
    List<RedPacket> queryAll();

    /**
     * 更新钱包余额
     * @return
     */
    int update(@Param("money")double money,@Param("id") int id);

}
