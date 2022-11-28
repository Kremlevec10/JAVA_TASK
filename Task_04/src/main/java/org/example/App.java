package org.example;

import java.util.Arrays;

/**
 * Задача:
 * Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
 */
public class App {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 3, 6, 3, 3, 8};
        System.out.println(Arrays.toString(array));
        remove(array, 3);
    }

    private static void remove(int[] arr, int removeNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == removeNumber) {
                arr[i] = 0;
            }
        }

        boolean isZerro = true;
        while (isZerro) {
            isZerro = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0 && arr[i + 1] != 0) {
                    int var = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = var;
                    isZerro = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        int[] newArr = Arrays.copyOf(arr, (arr.length - count));
        System.out.println(Arrays.toString(newArr));
    }
}
