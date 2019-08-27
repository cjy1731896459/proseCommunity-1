package com.wch.community.controller;
import com.wch.community.services.impl.UserServiceImpl;
import com.wch.community.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author WangPeiren
 */
@RequestMapping("/account")
@RestController
@Slf4j
public class AccountController {
    @Resource()
    UserServiceImpl service;
    /**
     * 登录功能
     */
    @RequestMapping("/login")
    public Result login(String username, String password){
        try {
            Result result = service.login(username, password);
            return result;
        } catch (Exception e) {
            log.error(e.getMessage());
            return Result.error();
        }
    }

    /**
     * 注册功能
     * @param username 用户名字
     * @param nickname 昵称
     * @param password 密码
     * @return
     */
    @RequestMapping("/register")
    public Result register(String username,String nickname,String password) {
        try {
            int rows = service.register(username, nickname, password);
            if (rows>0) {
                return Result.success(rows);
            }else {
                throw new Exception("数据出错");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            return Result.error();
        }
    }

    /**
     * 重置密码
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/reset/password")
    public Result resetPassword(String username,String password) {
        try {
            int rows = service.resetPassword(username, password);
            if(rows>0){
                return Result.success(rows);
            }else {
                throw new Exception("注册失败");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            return Result.error();
        }

    }
}
