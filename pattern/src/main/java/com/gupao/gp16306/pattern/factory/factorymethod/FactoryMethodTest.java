package com.gupao.gp16306.pattern.factory.factorymethod;

import com.gupao.gp16306.pattern.factory.IAnimal;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IAnimalFactory factory = new CatFactory();
        IAnimal animal = factory.create();
        animal.eat();
        animal.say();

        factory = new DogFactory();
        animal = factory.create();
        animal.eat();
        animal.say();
    }
}
