package com.gupao.gp16306.pattern.decorator.passport;

import com.gupao.gp16306.pattern.decorator.passport.old.ISigninService;
import com.gupao.gp16306.pattern.decorator.passport.old.SigninService;
import com.gupao.gp16306.pattern.decorator.passport.upgrade.ISiginForThirdService;
import com.gupao.gp16306.pattern.decorator.passport.upgrade.SiginForThirdService;

public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService( new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");
    }
}
