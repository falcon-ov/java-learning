package tasks.algorithms.sorts;

import java.util.Arrays;

/*
Merge Sort (сортировка слиянием)
Принцип "разделяй и властвуй":

Делим массив пополам, пока не останутся подмассивы из одного элемента.

Затем сливаем пары подмассивов обратно, 
но при этом объединяем их в правильном порядке (сортированно).
Каждое слияние происходит в отсортированном виде.
Стабильная и быстрая: O(n log n), требует доп. память.
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arrayInt = { 2, 6, 11, 12, 0, 7, 5, 1 };
        arrayInt = mergeSort(arrayInt);
        for (int i : arrayInt) {
            System.out.println(i);
        }
    }

    public static int[] mergeSort(int[] array) {
        int len = array.length;
        if (len <= 1) {
            return array;
        } else {
            int[] left = Arrays.copyOfRange(array, 0, len / 2);
            int[] right = Arrays.copyOfRange(array, len / 2, array.length);
            return merge(mergeSort(left), mergeSort(right));
        }
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = {};
        int i = 0, j = 0;
        while (true) {
            if (a.length == i) {
                for (int k = j; k < b.length; k++) {
                    result = addX(result.length, result, b[k]);
                }
                break;
            }
            if (b.length == j) {
                for (int k = i; k < a.length; k++) {
                    result = addX(result.length, result, a[k]);
                }
                break;
            }
            if (a[i] < b[j]) {
                result = addX(result.length, result, a[i]);
                i++;
            } else {
                result = addX(result.length, result, b[j]);
                j++;
            }
        }
        return result;
    }

    public static int[] addX(int n, int arr[], int x) {

        int newarr[] = new int[n + 1];

        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}
