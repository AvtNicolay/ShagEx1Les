package com.company;

public class Main0041 {
    public static void main(String[] args) {//main принимает пакет строк
//начинаем изучать методы
// функции объявляют внутри класса!
//public и  static
//1. нужно определить тип возвращаемого значения (int, double), бывает void , когда функция ничего не возвращает!
//
        int a = 1;
        int b = 2;
        int d;
        d = sum(a, b);//вызов метода
        System.out.print("sum= ");
        System.out.println(d);
        //System.out.println(sum(a, b)); - так тоже можно!

        System.out.print("min= ");
        System.out.println(min(a, b, d));

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        sum2(a);
        System.out.println(sum2(a));//java не ругается, сюда можно записать любое число переменных, хоть 0
        //например
        System.out.println(sum2(1, 2, 5, 7, 8, 9));//java не ругается, сюда можно записать любое число переменных, хоть 0
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
        //return a+b; можно так писать тоже!
    }

    public static int min(int a, int b, int d) {

        if (a < b && a < d) {
            return a;
        } else if (b < a && b < d) {
            return b;
        } else {
            return d;
        }
    }

    public static void printArray(int[] arr) {
 for (int i=0; i<arr.length; i++){
     System.out.print(arr[i]);
     System.out.print(" ");
     }
        System.out.println();
    }

    public static int sum2(int ...a) {
        //(int ...a)- это значит что можно передать любое число параметров
        //т.о. а теперь это обычный массив!
        a[0]=1;//т.е. a воспринимается как массив
        int s=0;
        for (int e : a){
            s=s+e; //это можно написать s+=e;
           // бывает s-=e; s*=e; s/=e; s%=e;

        }
        return s;
    }
}