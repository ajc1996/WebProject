package test;

import org.junit.Test;
import web.dao.SmUserMapper;
import web.model.SmUser;
import web.util.Newuuid;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class SmUserMapperTest extends BaseTest {

    @Resource
    private SmUserMapper smUserMapper;

    @Test
    public void insert() throws Exception {
        List<SmUser> smUserList = new ArrayList<>();
        SmUser smUser = new SmUser();
        smUser.setUseroid(Newuuid.getUUID());
        smUser.setUsnum("cfc");
        smUser.setUspassword("123456");
        smUser.setUslimit(1);
        smUser.setUsstate(1);
        smUser.setUscollege("计算机工程学院");
        smUser.setUsschool("淮海工学院");
        smUserList.add(smUser);
        SmUser smUser1 = new SmUser();
        smUser1.setUseroid(Newuuid.getUUID());
        smUser1.setUsnum("lx");
        smUser1.setUspassword("123456");
        smUser1.setUslimit(1);
        smUser1.setUsstate(1);
        smUser1.setUscollege("计算机工程学院");
        smUser1.setUsschool("淮海工学院");
        smUserList.add(smUser1);
        for (SmUser smUser11:smUserList) {
            smUserMapper.insert(smUser11);
            System.out.println("1");
        }
    }

}