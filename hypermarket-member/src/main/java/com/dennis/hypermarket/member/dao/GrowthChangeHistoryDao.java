package com.dennis.hypermarket.member.dao;

import com.dennis.hypermarket.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 14:30:26
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
