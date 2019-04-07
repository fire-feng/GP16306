package com.gupao.gp16306.pattern.observer.guava.Gper;

import com.google.common.eventbus.Subscribe;
import com.gupao.gp16306.pattern.observer.gperadvice.Question;

public class TeacherEvent {

    private String name;
    public TeacherEvent(String name){
        this.name = name;
    }

    @Subscribe
    public void subscribe(String str){
        System.out.println("===============================");
        System.out.println(name + "老师!" +str);
    }
}
