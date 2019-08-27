package com.wch.community.services;


import com.wch.community.utils.Result;

/**
 * @author a10.11.5
 */
public interface UserService {
    /**
     * 登录验证
     * @param username
     * @param password
     * @return
     */
    Result login(String username, String password);

    /**
     * 注册
     * @param username
     * @param nickname
     * @param password
     * @return
     */
    int register(String username, String nickname, String password);

    /**
     * 重置密码
     * @param username
     * @param password
     * @return
     */
    int resetPassword(String username, String password);

}
