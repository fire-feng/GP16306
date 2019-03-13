package com.gupao.gp16306.pattern.factory.abstractfactory;

public class CatFactory implements IAnimalFactory {
    @Override
    public IJump createJump() {
        return new CatJump();
    }

    @Override
    public IRun createRun() {
        return new CatRun();
    }
}
