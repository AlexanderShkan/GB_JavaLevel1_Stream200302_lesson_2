package ru.gb.stream200302_lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] agrs) {
        changeArray();
        /*1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;*/

        stuffArray();
        /*2 Задать пустой целочисленный массив размером 8.
        Написать метод, который c помощью цикла заполнит его
        значениями 1 4 7 10 13 16 19 22;*/

        generationArray();
        /*3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        написать метод, принимающий на вход массив и
        умножающий числа меньше 6 на 2;*/

        minMaxSearchArray();
        /*4 Задать одномерный массив.
        Написать методы поиска в нём минимального и максимального элемента;*/

        diagonalArray();
        /*5 Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        заполнить его диагональные элементы единицами, используя цикл(ы);*/

        int[] arr = new int[5];
        checkingArray(arr);
        /*6 Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true если в массиве есть место,
        в котором сумма левой и правой части массива равны. */


    }

    //Задание 1//
    private static void changeArray() {
        System.out.println("Задание 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i] == 1 ? 0 : 1; /*использую тернарный оператор с провернкой на
                                          равенство единице: если условие истина 1=1, то присваеваем
                                          ноль, если ложь, т.е. 0!=1, то присваеваем единицу*/
            System.out.print(a + " ");
        }
        System.out.print("\n");
    }

    //Задание 2//
    private static void stuffArray() {
        System.out.println("Задание 2");
        int[] arr = new int[8];
        for (int x = 0, y = 1; x < arr.length; x++, y = y + 3)
            arr[x] = y;
        System.out.println(Arrays.toString(arr));
    }

    //Задание 3//
    private static void generationArray() {
        System.out.println("Задание 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 4//
    private static void minMaxSearchArray() {
      System.out.println("Задание 4");
        int[] arr = {0, 1, 2, 3, 4, -5, 60, 7, 8, 9};
        int i=0;
        int minNum = arr[i];
        int maxNum = arr[i];
        int idMinNum = 0;
        int idMaxNum = 0;
      for (i = 0; i < arr.length; i++) {
           if (arr[i] < minNum) {
               minNum = arr[i];
               idMinNum = i;
           }
          if (arr[i] > maxNum) {
              maxNum = arr[i];
              idMaxNum = i;
          }
      }
        System.out.println("Минимальное число = " + minNum + " под индексом [" + idMinNum + "]");
        System.out.println("Максимальное число = " + maxNum + " под индексом [" + idMaxNum + "]");
    }

    //Задание 5//
    private static void diagonalArray () {
       System.out.println("Задание 5*");
       int n =5;
       int [] [] cub = new int[n][n];
       for (int y=0; y<n; y++){
           for (int x=0; x<n; x++) {
               if (y==x)
                   cub[y][x]=1;
               else
                   cub [y][x]=0;
               System.out.print(cub[y][x]);
           }
           System.out.print("\n");
       }

   }
    //Задание 6//
    private static boolean checkingArray (int [] arr) {
        System.out.println("Задание 6**");

        int leftSum=0;
        int rightSum=0;

        for (int i = 0; i < arr.length; i++) {


        for (int j = 0; j < i; j++) {
            leftSum = leftSum + arr[j];
        }

        for (int j = i; j < arr.length; j++) {
            rightSum = rightSum + arr[j];
        }

        if (leftSum == rightSum) return true;
        }
        return false;
    }

}








