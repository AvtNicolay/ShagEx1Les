package com.company;

public class Main005 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        float e = 2.1f;
        int f = 5;//!!!!!!!!!!!!!!!!!
        System.out.println(sum(4, 6, 8, 10, 23, 25));//!!
        System.out.print("f!=");
        System.out.println(fact(f));
        int s = sum(a, b) + sum(a, b, c) + sum(a, b, c, d);
        float ss = sum(a, e);

        System.out.print("fact2= ");
        System.out.println(fact2(5));

        //для рекурсии
        System.out.print("sumDigit= ");
        System.out.println(sumDigit(1234));

    }
    //перегрузки.
    //в java могут создаваться методы с одинаковым именем, главное чтобы у них отличались или количество параметров
    //или хотя бы имя одной переменной или хотя бы один тип

    //    public static int sum(int a, int...b1) - int ...b1 пишется последним и только один!

    public static int sum(int a, int b) {
        int s1 = a + b;
        return s1;
    }

    public static int sum(int a, int b, int c) {
        int s2 = a + b + c;
        return s2;
    }

    public static int sum(int a, int b, int c, int d) {
        int s3 = a + b + c + d;
        return s3;
    }

    public static float sum(int a, float e) {
        float s3 = a + e;
        return s3;
    }

    public static int sum(int a, int... arr) {
        int sss = 0;
        for (int i : arr) {
            sss += i;
        }

        return sss;
    }

    //делаем расчет факториала
//5!=5*4*3*2*1
    public static int fact(int f) {
        int n = 1;
        for (int i = f; i > 1; i--) {
            //(int      i<1; i--)//аналдогичная запись
            n = n * i; //f*=i; - аналогичная запись
        }
        return n;
    }

    public static int fact2(int n) {
//рекурсия - вызов метода в самом себе
//5!=5*4!;
//4!=483!;
//....
        if (n == 1) {
            return 1;
        }
        return n * fact2(n - 1);
        //при рекурсии n каждый раз снижается на 1 но ф-я не выполняется т.к. n!=1. когда условие выполняется
        //то все незаконченные прогоны завершаются и в обратном порядке проводится перемножение (это так из-за рекеурсии

    }

    public static int sumDigit(int n) {
//получение цифр от числа с помощью рекурсии
//int n=1234
//1234%10=4
//1234/10=123
//123%10=3
//123/10=12
//12 % 10 = 2
//12 / 10 = 1
// 1 / 10 = 1
// 1 % 10 = 0
//   реализация
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigit(n / 10);
//т.о. имеем только остатки (n%10), а sumDigit(n/10) - по факту не суммируется до того момента пока т=0
//при этом n благодаря sumDigit(n/10) - т.е. разрядность в 10 раз уменьшается!
    }
}