package com.gupao.gp16306.pattern.adapter.loginadapter.v2.adapters;

import com.gupao.gp16306.pattern.adapter.loginadapter.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
