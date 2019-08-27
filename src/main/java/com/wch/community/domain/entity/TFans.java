package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TFans {
    /**
    * 粉丝id
    */
    private Integer fansId;

    /**
    * 粉丝用户id
    */
    private Integer fansUidId;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 状态
    */
    private Integer status;
}