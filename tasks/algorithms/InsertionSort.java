package tasks.algorithms;

public class InsertionSort {
    /*
     * InsertionSort
     * Массив делится мысленно на две части: отсортированную и неотсортированную.
     * Берём элементы из неотсортированной части и вставляем их в правильное место в
     * отсортированной.
     * На каждом шаге:
     * выбираем элемент справа, "выталкиваем" его влево, пока не найдём правильное
     * место.
     * Эффективен для почти отсортированных данных. В среднем: O(n²).
     * 
     */
    public static void main(String[] args) {
        int[] arrayInt = { 2, 6, 11, 12, 0, 7, 5, 1 };
        insertionSort(arrayInt);
        for (int i : arrayInt) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                swap(array,j, j-1);
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];   
        arr[j] = temp;     
    }
}
