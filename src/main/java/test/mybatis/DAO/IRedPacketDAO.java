package test.mybatis.DAO;

import org.apache.ibatis.annotations.Param;
import test.mybatis.entity.RedPacket;

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
