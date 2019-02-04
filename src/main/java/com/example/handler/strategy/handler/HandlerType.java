package com.example.handler.strategy.handler;

import java.lang.annotation.*;

/**
 * @Author: mxcCui
 * @Description:
 * @Date: Created in 10:07 2019/2/2
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {

    String value();

}
