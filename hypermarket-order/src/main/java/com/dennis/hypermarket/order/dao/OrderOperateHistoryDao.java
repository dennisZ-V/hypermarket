package com.dennis.hypermarket.order.dao;

import com.dennis.hypermarket.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 14:52:31
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
