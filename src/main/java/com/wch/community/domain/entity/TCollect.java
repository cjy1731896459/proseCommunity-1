package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TCollect {
    /**
    * 收藏表id
    */
    private Integer collectId;

    /**
    * 文章id
    */
    private Integer articleId;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 状态
    */
    private Integer status;
}