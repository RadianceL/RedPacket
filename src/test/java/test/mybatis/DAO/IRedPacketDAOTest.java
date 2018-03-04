package test.mybatis.DAO;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.mybatis.FactoryMethod.DatabaseFactory;
import test.mybatis.entity.RedPacket;

public class IRedPacketDAOTest {

    private DatabaseFactory factory = new DatabaseFactory();

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getRedPacketById() {
        IRedPacketDAO mapper =(IRedPacketDAO) factory.getSqlSession("mybatis-config.xml",IRedPacketDAO.class);

        RedPacket packet = mapper.getRedPacketById(1);

        System.out.println(packet);
    }
}