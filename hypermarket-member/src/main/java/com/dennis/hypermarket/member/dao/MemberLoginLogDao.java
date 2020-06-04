package com.dennis.hypermarket.member.dao;

import com.dennis.hypermarket.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 14:30:26
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
