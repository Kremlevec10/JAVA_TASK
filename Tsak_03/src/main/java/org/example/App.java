package org.example;

import java.util.Arrays;

/**
 * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
 * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */
public class App {
    public static void main(String[] args) {
        int[] arrays = fillArrays();
        System.out.println(Arrays.toString(arrays));
        checkNaturalNumber(arrays);
    }

    private static int[] fillArrays() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int var = (int) (Math.random() * 100);
            if (var > 3) {
                arr[i] = var;
            } else {
                i--;
            }
        }
        return arr;
    }

    private static void checkNaturalNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int var = arr[i];
            for (int j = 2; j < arr[i]; j++) {
                if (var % j == 0) {
                    var = 0;
                    break;
                } else {
                    var = arr[i];
                }
            }
            if (var != 0) {
                System.out.println("Натуральное число - " + var);
            }
        }
    }
}
