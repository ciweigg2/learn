package com.example.handler.strategy.handler.biz;

import com.example.handler.strategy.handler.AbstractHandler;
import com.example.handler.strategy.handler.HandlerType;
import com.example.handler.strategy.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @Author: mxcCui
 * @Description: 团购订单处理器
 * @Date: Created in 10:17 2019/2/2
 */
@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }

}
