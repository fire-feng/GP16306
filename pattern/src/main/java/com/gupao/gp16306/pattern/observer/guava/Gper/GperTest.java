package com.gupao.gp16306.pattern.observer.guava.Gper;

import com.google.common.eventbus.EventBus;


public class GperTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        TeacherEvent teacherEvent = new TeacherEvent("tom");
        eventBus.register(teacherEvent);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");


        eventBus.post(question.toString());
    }
}
