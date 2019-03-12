package com.gupao.gp16306.pattern.factory.simplefactory;

import com.gupao.gp16306.pattern.factory.Cat;
import com.gupao.gp16306.pattern.factory.Dog;
import com.gupao.gp16306.pattern.factory.IAnimal;

public class AnimalFactory {

    public IAnimal ceateAnimal(String name){
        if ("cat".equals(name)){
            return new Cat();
        }else if("dog".equals(name)){
            return new Dog();
        }else
            return null;
    }
}
