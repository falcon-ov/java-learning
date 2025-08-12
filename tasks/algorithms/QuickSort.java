package tasks.algorithms;

/*
Quick Sort (быстрая сортировка)
Тоже "разделяй и властвуй", но без слияния.

Выбирается опорный элемент (pivot).

Все элементы меньше pivot идут налево, больше — направо.

Повторяем рекурсивно для левой и правой части.
Быстрее merge sort, но нестабильный. Выбор pivot сильно влияет на производительность.
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arrayInt = { 2, 6, 11, 12, 0, 7, 5, 1 };
        arrayInt = quickSort(arrayInt);
        for (int i : arrayInt) {
            System.out.println(i);
        }
    }

    public static int[] quickSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int pivot = array[array.length / 2];
        int[] left = {};
        int[] right = {};
        int[] middle = {};

        for (int num : array) {
            if (num < pivot) {
                left = addX(left, num);
            } else if (num > pivot) {
                right = addX(right, num);
            } else {
                middle = addX(middle, num);
            }
        }

        return concat(concat(quickSort(left), middle), quickSort(right));
    }

    public static int[] addX(int arr[], int x) {
        int n = arr.length;
        int newarr[] = new int[n + 1];

        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    public static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

}
