package com.gupao.gp16306.spring1_0.demo.service.impl;

import com.gupao.gp16306.spring1_0.demo.service.IDemoService;
import com.gupao.gp16306.spring1_0.mvcframework.annotation.FFService;

/**
 * 核心业务逻辑代码
 */
@FFService
public class DemoService implements IDemoService {
    @Override
    public String get(String name) {
        return "My name is " + name;
    }
}
