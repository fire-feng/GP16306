package com.gupao.gp16306.netty.rpc.provider;

import com.gupao.gp16306.netty.rpc.api.IRpcHelloService;

public class RpcHelloServiceImpl implements IRpcHelloService {

    public String hello(String name) {
        return "Hello " + name + "!";
    }

}
