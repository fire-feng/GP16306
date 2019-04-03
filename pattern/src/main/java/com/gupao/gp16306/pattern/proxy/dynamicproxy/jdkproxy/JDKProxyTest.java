package com.gupao.gp16306.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupao.gp16306.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) {

        /*try {
            Person obj  = (Person)new JDKMeipo().getInstance(new Girl());
            obj.findLove();
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os  = new FileOutputStream("D:\\java_dev_tools\\source_code\\study\\GP16306\\pattern\\target\\classes\\com\\gupao\\gp16306\\pattern\\proxy\\dynamicproxy\\$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        try {
            Object  obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
