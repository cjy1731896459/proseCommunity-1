package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TUser {
    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 昵称
    */
    private String nickname;

    /**
    * 密码
    */
    private String password;

    /**
    * 头像
    */
    private String userImg;

    /**
    * 性别
    */
    private String userSex;

    /**
    * 个人介绍
    */
    private String userDetails;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 文章数
    */
    private Integer articleNum;

    /**
    * 关注数
    */
    private Integer attentionNum;

    /**
    * 粉丝数
    */
    private Integer fansNum;

    /**
    * 点赞总数
    */
    private Integer clickNumSum;
}