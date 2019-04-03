package com.gupao.gp16306.spring1_0.demo.mvc.action;


import com.gupao.gp16306.spring1_0.demo.service.IDemoService;
import com.gupao.gp16306.spring1_0.mvcframework.annotation.FFAutowired;
import com.gupao.gp16306.spring1_0.mvcframework.annotation.FFController;
import com.gupao.gp16306.spring1_0.mvcframework.annotation.FFRequestMapping;
import com.gupao.gp16306.spring1_0.mvcframework.annotation.FFRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@FFController
@FFRequestMapping("/demo")
public class DemoAction {
    @FFAutowired    private IDemoService demoService ;

    @FFRequestMapping("/query")
    public  void query(HttpServletRequest req , HttpServletResponse resp,
                       @FFRequestParam("name") String name){
        String result = "My name is " + name;
        try {
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FFRequestMapping("/add")
    public  void add(HttpServletRequest req,HttpServletResponse resp,
                     @FFRequestParam("a") Integer a,@FFRequestParam("b") Integer b){
        try {
            resp.getWriter().write(a + "+" + b+ "=" + (a+b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FFRequestMapping("/sub")
    public  void sub(HttpServletRequest req,HttpServletResponse resp,
                     @FFRequestParam("a") Double a,@FFRequestParam("b" ) Double b){
        try {
            resp.getWriter().write(a + "-" + b+ "=" + (a-b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FFRequestMapping("/remove")
    public  String remove(@FFRequestParam("id") Integer id) {
        return "" + id;
    }
}
