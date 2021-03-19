package com.company;

public class Main002 {
    public static void main(String[] args) {
        int a = 10;
        short b = 20;
        long c = 300000000000l;

        System.out.println("c=" + c);
        float ss = (float) b / (float) c;
        System.out.println("ss=" + ss);
        float tt = 10000.4444F;
        float tt1 = 10000.F;
        float tt2 = .34650987F;
        double rr = 234.345760;
        char aa = '$';//задаем символ по его коду
        char bb = 64;
        System.out.println(bb);
        System.out.println((int)aa);

        //условные операторы
        if (tt<100001){
            System.out.println("!!!");
        }
        boolean isMale = true;
        if (!isMale) {
            System.out.println("right");
        }

        else{System.out.println("wrong");}

        int child = 12;

        if (child < 13) {
            System.out.println("human - child");
        }
        else {
            if (child > 13 && child < 21) {
                System.out.println("human - teen");
            } else {
                System.out.println("human - man");
            }
        }

        if (child < 13) {
            System.out.println("human - child");
        }
        else if (child > 13 && child < 21) {
            System.out.println("human - teen");
        } else {
            System.out.println("human - man");
        }

    }

}
