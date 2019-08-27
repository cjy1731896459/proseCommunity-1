package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TAttention {
    /**
    * 关注id
    */
    private Integer attentionId;

    /**
    * 关注者对应的用户id
    */
    private Integer attentionUidId;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 状态
    */
    private Integer status;
}