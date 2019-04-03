package com.gupao.gp16306.spring1_0.mvcframework.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FFAutowired {
    String value() default "";
}
