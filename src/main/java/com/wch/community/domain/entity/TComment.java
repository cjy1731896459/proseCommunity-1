package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TComment {
    /**
    * 评论id
    */
    private Integer commentId;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 评论内容
    */
    private String content;

    /**
    * 文章id
    */
    private Integer articleId;

    /**
    * 状态
    */
    private Integer status;
}