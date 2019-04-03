package com.gupao.gp16306.spring1_0.mvcframework.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FFRequestParam {
    String value() default "";
}
