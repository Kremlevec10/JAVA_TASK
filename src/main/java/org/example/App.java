package org.example;

import java.util.Arrays;

/**
 * 1.0. Максимальное, минимальное и среднее значение
 * Задача:
 * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class App {
    public static void main(String[] args) {
        int[] arrays = fillArrays();
        System.out.println(Arrays.toString(arrays));
        serchMaxMin(arrays);
    }

    private static int randomSize() {
        return (int) (Math.random() * 10);
    }

    private static int[] fillArrays() {
        int[] arr = new int[randomSize()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    private static void serchMaxMin(int[] arr) {
        int max, min;
        if (arr.length == 0) {
            System.out.println("Длина массива равна =" + arr.length);
            return;
        } else if (arr.length == 1) {
            min = arr[0];
            max = arr[0];
        } else {
            max = arr[0];
            min = arr[1];
            if (max < min) {
                int var = max;
                max = min;
                min = var;
            }

            for (int i = 2; i < arr.length; i++) {
                if (max < arr[i]) {
                    int var = max;
                    max = arr[i];
                    arr[i] = var;
                } else if (min > arr[i]) {
                    int var = min;
                    min = arr[i];
                    arr[i] = var;
                }
            }
        }
        System.out.println("Минимальное число равно = " + min);
        System.out.println("Максимальное число равно = " + max);
    }
}
