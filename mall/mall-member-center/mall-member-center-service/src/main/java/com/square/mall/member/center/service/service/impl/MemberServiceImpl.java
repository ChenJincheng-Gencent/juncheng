package com.square.mall.member.center.service.service.impl;

import com.github.pagehelper.util.StringUtil;
import com.square.mall.member.center.api.dto.MemberDto;
import com.square.mall.member.center.api.dto.response.MemberRspDto;
import com.square.mall.member.center.service.dao.MemberDao;
import com.square.mall.member.center.service.eo.MemberEo;
import com.square.mall.member.center.service.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *  会员基本信息Service实现类
 *
 * @author Gencent
 * @date 2019/8/19
 */

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberDao memberDao;

    @Override
    public MemberRspDto selectMemberByMobile(String mobile) {

        if (StringUtil.isEmpty(mobile)) {
            log.error("mobile is empty.");
            return null;
        }
        MemberEo memberEo = memberDao.selectMemberByMobile(mobile);
        if (null == memberEo) {
            log.error("memberEo is null. mobile: {}", mobile);
            return null;
        }

        MemberRspDto memberRspDto = new MemberRspDto();
        BeanUtils.copyProperties(memberEo, memberRspDto);
        return memberRspDto;

    }

    @Override
    public Long insertMember(MemberDto memberDto) {

        if (null == memberDto) {
            log.error("memberDto is null.");
            return 0L;
        }

        MemberEo memberEo = new MemberEo();
        BeanUtils.copyProperties(memberDto, memberEo);
        memberDao.insertMember(memberEo);
        return memberEo.getId();

    }

}
