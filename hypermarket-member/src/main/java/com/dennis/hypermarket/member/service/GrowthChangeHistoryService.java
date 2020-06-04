package com.dennis.hypermarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dennis.common.utils.PageUtils;
import com.dennis.hypermarket.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author dennis
 * @email 1785319835@qq.com
 * @date 2020-06-04 14:30:26
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

