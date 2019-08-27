package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TClickLike {
    /**
    * 点赞ID
    */
    private Integer clickLikeId;

    /**
    * 文章ID
    */
    private Integer articleId;

    /**
    * 文章ID
    */
    private Integer uid;

    /**
    * 状态
    */
    private Integer status;
}