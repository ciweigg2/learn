package com.example.handler.strategy.handler.biz;

import com.example.handler.strategy.handler.AbstractHandler;
import com.example.handler.strategy.handler.HandlerType;
import com.example.handler.strategy.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @Author: mxcCui
 * @Description: 普通订单处理器
 * @Date: Created in 10:17 2019/2/2
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }

}
