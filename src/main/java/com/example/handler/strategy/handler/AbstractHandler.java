package com.example.handler.strategy.handler;

import com.example.handler.strategy.model.OrderDTO;

/**
 * @Author: mxcCui
 * @Description:
 * @Date: Created in 13:57 2019/2/1
 */
public abstract class AbstractHandler {

    abstract public String handle(OrderDTO dto);

}
