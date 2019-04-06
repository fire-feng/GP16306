package com.gupao.gp16306.pattern.strategy.pay.payport;

public class UnionPay extends Payment {

    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }

}
