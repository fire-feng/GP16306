package com.gupao.gp16306.pattern.observer.events;

import com.gupao.gp16306.pattern.observer.events.mouseevent.Mouse;
import com.gupao.gp16306.pattern.observer.events.mouseevent.MouseEventCallback;
import com.gupao.gp16306.pattern.observer.events.mouseevent.MouseEventType;

public class MouseEventTest {

    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();

    }
}
