package com.company;

public class Main004 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //в пер е будут поочередно записываться все эл. массива
        for (int e : arr) {
            System.out.println(e);
        }
        //после знака : может указываться либо массив либо коллекция

        //такой же финт с массивом массивов
        float[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
        for (float[] e : arr2) {
            for (float v : e) {
                System.out.print(v);
                System.out.print(" ");
            }
            System.out.println();
            //стартуем по e - далее в е прогон v1, v2 и .т.д. по всем элементам доконца
            //короче просто цикл в цикле

            //такой способ нужен когда for (int i=0; I<arr2.length; i++)
        }

        //++ - инкремент
        //-- - декремент
        int a = 12;
        a++;
        a--;
        System.out.println(a);//a=12
        int b = a++;//записи сначала присваивание, затем инкремент
        //ЭТА ЗАПИСЬ ПОСТФИКСНАЯ
        System.out.println(b); //т.е. b=12
        System.out.println(a); //т.е. a=13

        //если
        // b++ = a;
        //ЭТА ЗАПИСЬ ПРЕФИКСНАЯ т.е. число осталось прежним, но давлее он будет как b+1
        System.out.println(b); //т.е. b=13
        System.out.println(b); //т.е. a=12

        //типичная задача переменной
        int x = 23;
        int y = 23;
        int z = x++ - --y + y++ - --y - --x;
        //int z=x -   --y + y -   --y - --x;
        //int z=22 -  --23 + 23 - --23 - --12;
        //int z=22(но в памяти 22+1) -22 (сразу отняли -1) + (осталось 22. но в памяти 23) -   22(23-1) - 22(23-1);
        System.out.println(z); // z=22

        int[] arr3;
        for (int i = 0; i < arr.length; i++) {
        }

        //brake, и continue
        //brake - останавливает работу цикла (досрочно)
        //continue - пропускает выполнение текущей итрации цикла и переходит к выпонлению следующей.

        //1.пусть дан массив целых чисел. нужно вывести первое число кратное 3.

        int[] arr4 = {1, 2, 3, 4, 5, 6};
        for (int j : arr4) {
            if (j == 3) {
                System.out.println("нашел");
                break;
            }
        }

        for (int j : arr4) {
            if (j % 3 == 0) {
                System.out.println("пропускаем");
                continue;
            }
            System.out.println(j);

        }
        //что прерывает break&
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                break;//он прерывает только внутренний цикл (т.е. только тот цикл которому он принадлежит!!!)

            }
        }
        //сортировки - метод сортировки пузырьком!!
        int[] arr5 = {1, 12, 3, 15, 9, 7};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = i + 1; j < arr5.length; j++) {
                int temp;
                if (arr5[i] > arr5[j]) {
                    temp = arr5[j];
                    arr5[j] = arr5[i];
                    arr5[i] = temp;
                }
            }
            System.out.print(arr5[i]);
            System.out.print(" ");


        }
        System.out.println();
    }
}
