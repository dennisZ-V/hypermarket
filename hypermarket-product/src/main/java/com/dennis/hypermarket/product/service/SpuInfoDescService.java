package com.dennis.hypermarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dennis.common.utils.PageUtils;
import com.dennis.hypermarket.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 13:26:02
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

