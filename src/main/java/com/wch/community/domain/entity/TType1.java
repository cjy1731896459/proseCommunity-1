package com.wch.community.domain.entity;

import lombok.Data;


/**
*
*@author WangPeiren
*/
@Data
public class TType1 {
    /**
    * 一级菜单id
    */
    private Integer type1Id;

    /**
    * 一级菜单名字
    */
    private String type1Name;

    /**
    * 状态
    */
    private Integer status;
}