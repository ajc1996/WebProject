package web.service.impl;

import org.springframework.stereotype.Service;
import web.dao.SmUserMapper;
import web.model.SmUser;
import web.model.SmUserExample;
import web.service.LoginService;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    SmUserMapper smUserMapper;

    @Override
    public void CheckLogin(SmUser smUser) {

    }
}
