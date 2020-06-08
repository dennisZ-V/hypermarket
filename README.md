# hypermarket

# DAY 1

## 一、创建项目微服务

商品服务、仓储服务、订单服务、优惠券服务、用户服务

共同点：

1. web、openfeign
2. 每一个服务，包名com.dennis.hypermarket.*(product/order/ware/coupon/member)
3. 模块名：hypermarket-*
4. 创建数据库表
5. 添加renren-fast-*服务，逆向生成代码
6. 创建common服务，将通用依赖引入common中

## 二、Spring Cloud Alibaba-Nacos注册中心

1. 在common服务中引入spring-cloud-alibaba-dependencies依赖管理和spring-cloud-starter-alibaba-nacos-discovery依赖

   ```xml
   <dependencyManagement>
       <dependencies>
           <dependency>
               <groupId>com.alibaba.cloud</groupId>
               <artifactId>spring-cloud-alibaba-dependencies</artifactId>
               <version>2.2.0.RELEASE</version>
               <type>pom</type>
               <scope>import</scope>
           </dependency>
       </dependencies>
   </dependencyManagement>
   
   <dependency>
       <groupId>com.alibaba.cloud</groupId>
       <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
   </dependency>
   ```

2. 修改配置文件

   ```yaml
   spring:
       cloud:
         nacos:
           discovery:
             server-addr: 127.0.0.1:8848
       application:
         name: hypermarket-member
   ```

3. 开启服务注册发现注解

   ```java
   @EnableDiscoveryClient
   @SpringBootApplication
   public class HypermarketMemberApplication {
       public static void main(String[] args) {
           SpringApplication.run(HypermarketMemberApplication.class, args);
       }
   }
   ```

## 三、Spring Cloud OpenFeign测试

1. coupon服务中添加测试接口

   ```java
   @RequestMapping("/member/list")
   public R memberCoupons(){
       CouponEntity couponEntity = new CouponEntity();
       couponEntity.setCouponName("满100减10");
       return R.ok().put("coupons",Arrays.asList(couponEntity));
   }
   ```

2. member服务中添加远程调用包和远程调用接口类

   ```java
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
   ```

3. member服务中添加测试接口

   ```java
   @RequestMapping("/coupons")
   public R test(){
       MemberEntity memberEntity = new MemberEntity();
       memberEntity.setNickname("dennis");
       R memberCoupons = couponFeignService.memberCoupons();
       return R.ok().put("member", memberEntity).put("coupons", memberCoupons.get("coupons"));
   }
   ```

## 四、Spring Cloud Alibaba-Nacos配置中心

1. 添加依赖

   ```xml
   <dependency>
       <groupId>com.alibaba.cloud</groupId>
       <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
   </dependency>
   ```

2. 修改配置文件名为：bootstrap.yml，修改配置文件

   ```yaml
   spring.application.name: hypermarket-coupon
   spring.cloud.nacos.config.file-extension: yaml
   spring.cloud.nacos.config.server-addr: 127.0.0.1:8848
   ```

3. 在ncaos配置中心中添加配置

   ![image-20200604164911725](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20200604164911725.png)

4. 细节

   - 命名空间：配置隔离

     - 默认 public(保留空间)：默认新增的所有配置都在public空间

     - 开发、测试、生产可以创建不同的命名空间：利用命名空间来做环境隔离。

       ```yaml
       #设置命名空间
       spring.cloud.nacos.config.namespace: dev
       ```

     - 每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，值加载自己命名空间下的所有配置

   - 配置集：所有的配置的集合

   - 配置集ID：类似文件名（Data ID

   - 配置分组：

     - 默认所有的配置文件都属于DEFAULT_GROUP

     - ```yaml
       #设置分组
       spring.cloud.nacos.config.group: DEFAULT_GROUP
       ```

5. 同时加载多个配置

## 五、Spring Cloud Gateway

1. 简介

   网关作为流量的入口，常用功能包括路由转发、权限检验、限流控制。

2. 步骤：

   - 新建gateway项目

   - 引入依赖

     ```xml
     <dependency>
         <groupId>org.springframework.cloud</groupId>
         <artifactId>spring-cloud-starter-gateway</artifactId>
     </dependency>
     ```

   - 修改配置文件

     ```yaml
     spring:
     	gateway:
           routes:
             - id: test_route
               uri: https://www.baidu.com
               predicates:
                 - Query=url, baidu
     ```

     