package com.wch.community.services.impl;

import com.wch.community.domain.entity.TUser;
import com.wch.community.mapper.TUserMapper;
import com.wch.community.services.UserService;
import com.wch.community.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author WangPeiren
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    TUserMapper userMapper;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result login(String username, String password) {
        TUser user = userMapper.login(username);
        Result result = new Result();
        if(user==null){
            result.setMessage("用户不存在");
            result.setStatus(404);
        }else if(password.equals(user.getPassword())){
            result.setStatus(200);
            result.setMessage("登录成功");
            result.setData(user.getUserName());
        }else {
            result.setMessage("密码错误");
            result.setStatus(404);
        }
        return result;
    }

    @Override
    public int register(String username, String nickname, String password) {
        int rows = userMapper.register(username, nickname, password);
        return rows;
    }

    @Override
    public int resetPassword(String username, String password) {
        int rows = userMapper.resetPassword(username, password);
        return rows;
    }
}
