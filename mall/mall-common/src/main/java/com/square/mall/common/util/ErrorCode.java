package com.square.mall.common.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误码枚举类
 * 格式为应用标识-功能域-错误类型-错误码
 *
 * @author Gencent
 * @date 2019/8/20
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ErrorCode {

    /**
     * 成功
     */
    SUCCESS("0", "成功"),

    /**
     * 失败
     */
    FAILURE("-1", "请求处理失败"),


    /*----------------------------------------------会员应用----------------------------------------------------------*/

    /**
     * 参数不合法
     */
    ME_APP_PARA_ILLEGAL("01-00-P-00001","参数不合法"),

    /**
     * 验证码错误
     */
    ME_APP_AUTH_CODE_ERROR("01-01-B-00002","验证码错误"),

    /*----------------------------------------------会员中心----------------------------------------------------------*/

    /**
     * 数据库操作失败
     */
    ME_CEN_DATABASE_OPT_FAILED("07-00-D-00001","数据库操作失败"),

    /**
     * 数据库入参不合法
     */
    ME_CEN_DATABASE_PARA_ILLEGAL("07-00-D-00002","数据库入参不合法"),

    /**
     * 数据不存在
     */
    ME_CEN_DATABASE_DATA_NOT_EXIST("07-00-D-00003","数据不存在"),

    /**
     * 数据已存在
     */
    ME_CEN_DATABASE_DATA_ALREADY_EXIST("07-00-D-00004","数据已存在"),

    /*----------------------------------------------商品应用----------------------------------------------------------*/

    /**
     * 参数不合法
     */
    IT_APP_PARA_ILLEGAL("03-00-P-00001","参数不合法"),

    /*----------------------------------------------商品中心----------------------------------------------------------*/

    /**
     * 数据库操作失败
     */
    IT_CEN_DATABASE_OPT_FAILED("08-00-D-00001","数据库操作失败"),

    /**
     * 数据库入参不合法
     */
    IT_CEN_DATABASE_PARA_ILLEGAL("08-00-D-00002","数据库入参不合法"),

    /**
     * 数据不存在
     */
    IT_CEN_DATABASE_DATA_NOT_EXIST("08-00-D-00003","数据不存在"),

    /**
     * 数据已存在
     */
    IT_CEN_DATABASE_DATA_ALREADY_EXIST("08-00-D-00004","数据已存在"),

    /*----------------------------------------------交易应用----------------------------------------------------------*/

    /**
     * 参数不合法
     */
    TR_APP_PARA_ILLEGAL("03-00-P-00001","参数不合法"),

    /**
     * 系统错误
     */
    SYSTEM_ERROR("999999","系统错误");


    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误描述
     */
    private final String msg;


}
