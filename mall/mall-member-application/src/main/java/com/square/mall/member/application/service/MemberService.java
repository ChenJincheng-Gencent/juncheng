package com.square.mall.member.application.service;

import com.square.mall.common.dto.RspDto;
import com.square.mall.member.center.api.dto.response.MemberRspDto;

public interface MemberService {

    /**
     *  根据手机号查询会员信息
     *
     * @param mobile 手机号
     * @return 会员信息
     */
    RspDto<MemberRspDto> selectMemberByMobile(String mobile);
}
