package com.wch.community.utils;

import lombok.Data;

/**
 * @author WangPeiren
 */
@Data
public class Result<T> {
    private String message;
    private int Status;
    private T data;

    public static<T> Result success(T t){
        Result result = new Result();
        result.setData(t);
        result.setMessage(Constant.RESULT_SUCCESS);
        result.setStatus(Constant.RESULT_SUCCESS_STATUS);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setStatus(Constant.RESULT_ERROR_STATUS);
        result.setMessage(Constant.RESULT_ERROR);
        return result;
    }
}
