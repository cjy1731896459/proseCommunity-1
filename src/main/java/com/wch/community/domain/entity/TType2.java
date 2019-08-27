package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TType2 {
    /**
    * 二级菜单id
    */
    private Integer type2Id;

    /**
    * 二级菜单名字
    */
    private String type2Name;

    /**
    * 一级菜单名字
    */
    private Integer type1Id;

    /**
    * 状态
    */
    private Integer status;
}