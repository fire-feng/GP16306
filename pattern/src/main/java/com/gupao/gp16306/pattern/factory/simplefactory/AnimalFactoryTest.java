package com.gupao.gp16306.pattern.factory.simplefactory;

import com.gupao.gp16306.pattern.factory.Cat;
import com.gupao.gp16306.pattern.factory.Dog;
import com.gupao.gp16306.pattern.factory.IAnimal;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        IAnimal animal = new Cat();
        animal.say();
        animal.eat();
        animal = new AnimalFactory().ceateAnimal("dog");
        animal.say();
        animal.eat();

        animal = new AnimalFactory().createAnimal2("com.gupao.gp16306.pattern.factory.Cat");
        animal.say();
        animal.eat();

        animal = new AnimalFactory().createAnimal3(Dog.class);

        animal.say();
        animal.eat();
    }
}
