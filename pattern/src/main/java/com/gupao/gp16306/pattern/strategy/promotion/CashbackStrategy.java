package com.gupao.gp16306.pattern.strategy.promotion;

public class CashbackStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
