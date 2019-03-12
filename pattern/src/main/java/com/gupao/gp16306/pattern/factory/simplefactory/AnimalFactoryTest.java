package com.gupao.gp16306.pattern.factory.simplefactory;

import com.gupao.gp16306.pattern.factory.Cat;
import com.gupao.gp16306.pattern.factory.Dog;
import com.gupao.gp16306.pattern.factory.IAnimal;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        IAnimal animal = new Cat();
        animal.say();
        animal.eat();
        animal = factory.ceateAnimal("dog");
        animal.say();
        animal.eat();

        animal = factory.createAnimal2("com.gupao.gp16306.pattern.factory.Cat");
        animal.say();
        animal.eat();

        animal = factory.createAnimal3(Dog.class);

        animal.say();
        animal.eat();
    }
}
