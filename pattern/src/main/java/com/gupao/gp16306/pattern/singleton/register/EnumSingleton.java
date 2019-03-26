package com.gupao.gp16306.pattern.singleton.register;

public enum EnumSingleton {
    INSTANCE,ACTIVE,NONE;
    private Object data;
    public Object getData(){
        return data;
    }

    public  void setData(Object data){
        this.data = data;
    }

    public  static  EnumSingleton getInstance(){
        return INSTANCE;
    }

}
