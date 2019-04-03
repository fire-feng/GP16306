package com.gupao.gp16306.spring1_0.mvcframework.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FFRequestMapping {
    String value() default "";
}
