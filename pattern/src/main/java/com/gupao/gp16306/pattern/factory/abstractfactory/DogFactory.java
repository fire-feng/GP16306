package com.gupao.gp16306.pattern.factory.abstractfactory;

public class DogFactory implements IAnimalFactory {
    @Override
    public IJump createJump() {
        return new DogJump();
    }

    @Override
    public IRun createRun() {
        return new DogRun();
    }
}
