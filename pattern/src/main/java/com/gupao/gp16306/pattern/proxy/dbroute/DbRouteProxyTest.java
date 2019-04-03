package com.gupao.gp16306.pattern.proxy.dbroute;

import com.gupao.gp16306.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.gupao.gp16306.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbRouteProxyTest {

    public static void main(String[] args) {

        try {
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2016/06/11");
            order.setCreateTime(date.getTime());

//            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());

            orderService.createOrder(order);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
