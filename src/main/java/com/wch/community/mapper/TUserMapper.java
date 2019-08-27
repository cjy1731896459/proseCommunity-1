package com.wch.community.mapper;

import com.wch.community.domain.entity.TUser;
import org.apache.ibatis.annotations.Param;


/**
*
*@author WangPeiren
*/
public interface TUserMapper {
    /**
     * 登录验证
     * @param username
     * @return
     */
    TUser login(@Param("username") String username);

    /**
     * 注册
     * @param username
     * @param nickname
     * @param password
     * @return
     */
    int register(@Param("username")String username,@Param("nickname")String nickname,@Param("password")String password);

    /**
     * 重置密码
     * @param username
     * @param password
     * @return
     */
    int resetPassword(@Param("username")String username,@Param("password")String password);
}