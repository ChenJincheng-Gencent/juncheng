package com.square.mall.common.dto;

import com.square.mall.common.enums.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通用分页返回DTO
 *
 * @author Gencent
 * @date 2020/7/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "通用分页返回消息体")
public class PageRspDto<T> implements Serializable {

    private static final long serialVersionUID = -8255510440938304460L;

    /**
     * 成功
     */
    public static final PageRspDto<Void> SUCCESS = new PageRspDto<>(ErrorCode.SUCCESS);

    /**
     * 失败
     */
    public static final PageRspDto<Void> FAILURE = new PageRspDto<>(ErrorCode.FAILURE);



    /**
     * 错误码
     */
    @ApiModelProperty(name = "code", value = "错误码")
    private String code;

    /**
     * 错误描述
     */
    @ApiModelProperty(name = "msg", value = "错误描述")
    private String msg;

    /**
     * 总记录数
     */
    @ApiModelProperty(name = "total", value = "总记录数")
    private Long total;

    /**
     * 数据泛型
     */
    @ApiModelProperty(name = "data", value = "数据")
    private T data;

    public PageRspDto(Long total, T data) {
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg = ErrorCode.SUCCESS.getMsg();
        this.total = total;
        this.data = data;
    }

    public PageRspDto(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

}
