package com.dennis.hypermarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dennis.common.utils.PageUtils;
import com.dennis.hypermarket.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 14:55:42
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

