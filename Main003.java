package com.company;

public class Main003 {
    public static void main(String[] args) {
        String s = "hello";
        switch (s) {
            case ("hello"):
                System.out.println("hello, hello");
                break;
            case ("not hello"):
                System.out.println("not hello, hello");
                break;
            default:
                System.out.println("???");
        }
        int i=5;
        switch (i) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Окрябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Error");
        }

        // String month = null;

        switch (i) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Error");
                break;
        }
//массивы
//int [] arr = new int[5];//20 байт оперативной памяти 4*5
//массивы дожны иметь фикс.размер
//индексация элментов массива начинается с 0.
//arr[0] - воспринисмаем как переменную
        int[] arr = new int[5];//20 байт оперативной памяти 4*5
        arr[1] = 10;
        arr[4]=20;
        arr[0]=arr[1]+arr[4];
        System.out.println(arr[0]);
//номер массива может быть переменной (целочисленной)
//многомерные массивы
        float[][] arr2 = new float[5][5];
        System.out.println(arr2[0].length*arr2.length);
        //inline объявление массивов (строчные массивы)
        int[] arr3 = {3, 4, 5, 6, 7};
        System.out.println(arr3[3]);
        String[] arr4 = {"hello", "fuck"};
      //  int[] arr5 = {{2, 3}, {3, 4},{5, 6}};
}
}
