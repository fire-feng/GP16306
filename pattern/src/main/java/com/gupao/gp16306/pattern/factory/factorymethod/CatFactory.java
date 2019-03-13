package com.gupao.gp16306.pattern.factory.factorymethod;

import com.gupao.gp16306.pattern.factory.Cat;
import com.gupao.gp16306.pattern.factory.IAnimal;

public class CatFactory implements IAnimalFactory {
    @Override
    public IAnimal create() {
        return new Cat();
    }
}
