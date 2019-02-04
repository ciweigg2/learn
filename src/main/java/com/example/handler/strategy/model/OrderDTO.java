package com.example.handler.strategy.model;

import com.example.handler.checker.Check;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: mxcCui
 * @Description:
 * @Date: Created in 9:48 2019/2/2
 */
@Data
public class OrderDTO {

    private String code;

    private BigDecimal price;

    /**
     * 订单类型
     * 1：普通订单；
     * 2：团购订单；
     * 3：促销订单；
     */
    private String type;

}
