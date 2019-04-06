package com.gupao.gp16306.pattern.strategy.pay.payport;

public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }

}
