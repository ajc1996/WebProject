package web.service.impl;

import org.springframework.transaction.annotation.Transactional;
import web.dao.SmUserMapper;
import web.model.SmUser;
import web.model.SmUserExample;
import web.service.SmUserService;

import javax.annotation.Resource;
import java.util.List;

public class SmUserServiceImpl implements SmUserService {

    @Resource
    SmUserExample smUserExample;

    @Resource
    SmUserMapper smUserMapper;

    @Transactional
    @Override
    public Boolean InsertUser(List<SmUser> smUserList) {
        Boolean Result = true;
        smUserExample.clear();
        try {
            for (SmUser smUser:smUserList) {
                smUserMapper.insert(smUser);
                throw new Exception("插入失败！");
            }
        }catch (Exception e){
            Result = false;
        }
        return Result;
    }
}
