package com.dennis.hypermarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dennis.common.utils.PageUtils;
import com.dennis.hypermarket.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 13:26:02
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

