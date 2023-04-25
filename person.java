package com.ctdcn.template;

public abstract class person {

    public void templet(){
        morning();
        work();
        night();
    }

    protected  void morning(){
        System.out.println("-----------------起床------------------");
    }

    public abstract void work();

    protected  void night(){
        System.out.println("-----------------睡觉------------------");
    }

}
