package com.dennis.hypermarket.product;

import com.dennis.hypermarket.product.entity.BrandEntity;
import com.dennis.hypermarket.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class HypermarketProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = brandService.getById(1);
        log.info("brandEntity : {}" ,brandEntity);
    }

}
