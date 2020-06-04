package com.dennis.hypermarket.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dennis.common.utils.PageUtils;
import com.dennis.hypermarket.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 14:52:31
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

