package com.example.orderservice.controller;

import com.central.common.api.CommonResult;
import com.example.orderservice.domain.Order;
import com.example.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @PostMapping("/create")
    public CommonResult<String> create(@RequestBody Order order) {
        orderService.create(order);
        return CommonResult.success("订单创建成功!");
    }
}
