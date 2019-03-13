package com.gupao.gp16306.pattern.factory.factorymethod;

import com.gupao.gp16306.pattern.factory.Dog;
import com.gupao.gp16306.pattern.factory.IAnimal;

public class DogFactory implements IAnimalFactory {
    @Override
    public IAnimal create() {
        return new Dog();
    }
}
