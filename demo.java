package com.ctdcn.template;

public class demo {
    public static void main(String[] args) {
        person p1 = new doctor();
        p1.templet();
        System.out.println("===============================");
        person p2 = new it();
        p2.templet();
    }
}
