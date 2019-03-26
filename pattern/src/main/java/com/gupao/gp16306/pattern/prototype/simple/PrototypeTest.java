package com.gupao.gp16306.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {

        // 创建一个具体的需要克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        // 填充属性，方便测试
        concretePrototypeA.setAge(36);
        concretePrototypeA.setName("prototype");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("sport");
        concretePrototypeA.setHobbies(hobbies);
        System.out.println(concretePrototypeA);

        // 创建Client对象，准备开始克隆
        Client client = new Client(concretePrototypeA);

        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值:" + concretePrototypeA.getHobbies());

        hobbies.add("swim");
        concretePrototypeA.setHobbies(hobbies);
        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值:" + concretePrototypeA.getHobbies());

        System.out.println("对象地址比较:"+(concretePrototypeClone.getName() == concretePrototypeA.getName()));
        System.out.println("对象地址比较:"+(concretePrototypeClone.getHobbies() == concretePrototypeA.getHobbies()));

        System.out.println("对象地址比较:"+(concretePrototypeClone == concretePrototypeA));
    }
}
