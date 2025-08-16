package tasks.algorithms.utils;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = array_remove(arr, 0);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] array_remove(int[] arr, int idx) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; j < arr.length; i++, j++) {
            if (j == idx) {
                i--;
                continue;
            }
            ;
            newArr[i] = arr[j];
        }
        return newArr;
    }
}
