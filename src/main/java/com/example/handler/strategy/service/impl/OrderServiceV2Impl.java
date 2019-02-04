package com.example.handler.strategy.service.impl;

import com.example.handler.strategy.handler.AbstractHandler;
import com.example.handler.strategy.handler.HandlerContext;
import com.example.handler.strategy.model.OrderDTO;
import com.example.handler.strategy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: mxcCui
 * @Description:
 * @Date: Created in 9:54 2019/2/2
 */
@Service
public class OrderServiceV2Impl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }

}
