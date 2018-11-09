package com.example.DAO;

import com.example.entity.RedPacket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IRedPacketDAO {

    /**
     *
     * @param id
     * @return
     */
    RedPacket getRedPacketById(int id);

    /**
     *
     * @param redPacket
     * @return
     */
    int putRedPacket(@Param("redPacket")RedPacket redPacket);

    /**
     *
     * @return
     */
    List<RedPacket> queryAll();

    /**
     *
     * @return
     */
    int update(@Param("money")double money,@Param("id") int id);

}
