package com.company;

public class Main001 {
    public static void main(String[] args) {
        System.out.println("hello world");
	/*
        переменная - это именованая область памяти
         write your code here
        */
        int a = 10;
        int a1 = 21;
        int a2 = a+a1;
        int div = a1/a;
        int a3 = ((a1+1)/a);
        byte b = 2;
        float t = 0.000001f;
        double e = -2.68;
        System.out.println("a="+a+", a1="+a1);
        System.out.println("a2="+a2);
        System.out.println(a3);
        System.out.println(b);
        System.out.println(t);
        System.out.println(e);
        System.out.println(div);
        boolean r = true;
        System.out.println(r);
        /*явное преобразование
         * преобразованный тип должен занимать место в памяти не менее исходного
         */
        float t1;
        t1  = (int) (a1/a);
        System.out.println(t1);
        float t2 = (int)t1;
        t1 = t2;
        System.out.println("t2="+t2);
        System.out.println("t1="+t1);
    }

}
