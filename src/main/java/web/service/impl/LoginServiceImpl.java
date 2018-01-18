package web.service.impl;

import org.springframework.stereotype.Service;
import web.dao.SmUserMapper;
import web.model.SmUser;
import web.model.SmUserExample;
import web.service.LoginService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    SmUserMapper smUserMapper;

    @Resource
    SmUserExample smUserExample;

    @Override
    public Boolean CheckLogin(SmUser smUser) {
        Boolean Result = false;
        smUserExample.clear();
        smUserExample.createCriteria().andUsnumEqualTo(smUser.getUsnum());
        List<SmUser> smUserList = smUserMapper.selectByExample(smUserExample);
        if(smUserList.get(0).getUspassword().equals(smUser.getUspassword())){
            Result = true;
        }
        return Result;
    }
}
