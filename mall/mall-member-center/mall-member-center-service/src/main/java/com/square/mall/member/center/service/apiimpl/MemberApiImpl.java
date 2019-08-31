package com.square.mall.member.center.service.apiimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.square.mall.common.dto.RspDto;
import com.square.mall.member.center.api.MemberApi;
import com.square.mall.member.center.api.dto.response.MemberRspDto;
import com.square.mall.member.center.service.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;

/**
 *  会员基本信息RPC接口实现类
 *
 * @author Gencent
 * @date 2019/8/19
 */
@Slf4j
@Service(version = "1.0.0", interfaceClass = MemberApiImpl.class)
public class MemberApiImpl implements MemberApi {

    @Resource
    private MemberService memberService;

    @Override
    public RspDto<MemberRspDto> findMemberByMobile(String mobile) {

        if (StringUtils.isEmpty(mobile)) {
            log.error("mobile is empty.");
            return null;
        }

        return new RspDto<>(memberService.findMemberByMobile(mobile));
    }
}
