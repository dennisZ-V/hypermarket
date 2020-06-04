package com.dennis.hypermarket.ware.dao;

import com.dennis.hypermarket.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 14:55:42
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
