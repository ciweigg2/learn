package com.example.handler.web;

import com.example.handler.checker.Check;
import com.example.handler.strategy.model.OrderDTO;
import com.example.handler.strategy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandlerController {

    @Autowired
    private IOrderService iOrderService;

    /**
     * {"code":"12323232324234234234234","price":"1.0","type":"3"}
     *
     * @param orderDTO
     * @return
     */
    @RequestMapping(value = "handler")
    @Check(value = "code<10:code必须少于10位")
    public String handler(@RequestBody OrderDTO orderDTO){
        return iOrderService.handle(orderDTO);
    }

}
