package com.dennis.hypermarket.member.feign;

import com.dennis.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dinnes Zhang
 * @date
 */
@FeignClient("hypermarket-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();

}
