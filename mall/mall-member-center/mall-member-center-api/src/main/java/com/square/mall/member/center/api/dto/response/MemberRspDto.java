package com.square.mall.member.center.api.dto.response;

import java.io.Serializable;

/**
 *  会员基本返回信息
 * @author Gencent
 * @date 2019/8/21
 */
public class MemberRspDto implements Serializable {

    private static final long serialVersionUID = 8753491498155471509L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

}
