package com.gupao.gp16306.pattern.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {

    public float h  = 200 ;
    public  float d = 20;
    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /=2 ;
        this.h /=2 ;
    }
}
