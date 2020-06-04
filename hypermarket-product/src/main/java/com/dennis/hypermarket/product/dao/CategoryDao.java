package com.dennis.hypermarket.product.dao;

import com.dennis.hypermarket.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 13:26:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
