package com.gupao.gp16306.pattern.factory.abstractfactory;



public class AbstractFactoryTest {

    public static void main(String[] args) {
        IAnimalFactory factory = new DogFactory();
        factory.createJump().go();
        factory.createRun().read();

        factory = new CatFactory();
        factory.createJump().go();
        factory.createRun().read();
    }
}
