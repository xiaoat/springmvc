package com.fanfan.system.core.annotation;

import java.lang.annotation.*;

/**
 * @description: 自定义注解 拦截Controller层
 * @autor: huan.gao
 * @Time: 2016/9/8 17:13
 */
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerLog {
    String description() default "";
}
