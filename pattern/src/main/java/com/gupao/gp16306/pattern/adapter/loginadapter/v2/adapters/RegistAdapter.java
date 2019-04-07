package com.gupao.gp16306.pattern.adapter.loginadapter.v2.adapters;

import com.gupao.gp16306.pattern.adapter.loginadapter.ResultMsg;

public interface RegistAdapter {

    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
