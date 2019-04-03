package com.gupao.gp16306.pattern.proxy.dbroute.db_tools;

public class DynamicDataSourceEntity {

    public final static String DEFAULE_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntity(){}


    public static String get(){return  local.get();}

    public static void restore(){
        local.set(DEFAULE_SOURCE);
    }

    //DB_2017
    //DB_2018
    public static void set(String source){local.set(source);}

    public static void set(int year){local.set("DB_" + year);}

}