package com.wch.community.domain.entity;

import java.util.Date;
import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TArticle {
    /**
    * 文章id
    */
    private Integer articleId;

    /**
    * 文章标题
    */
    private String articleTitle;

    /**
    * 文章内容
    */
    private String articleContent;

    /**
    * 2级分类 默认为1
    */
    private Integer type2Id;

    /**
    * 喜欢数
    */
    private Integer clickLikeNum;

    /**
    * 文章修改时间
    */
    private Date updateTime;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 状态
    */
    private Integer status;
}