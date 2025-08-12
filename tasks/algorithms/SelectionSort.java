package tasks.algorithms;

public class SelectionSort {
    /*
     * Selection Sort (сортировка выбором)
     * 
     * Находим минимальный элемент и ставим в начало.
     * Повторяем для подмассива (от второго элемента и так далее).
     * Ищем минимум → ставим на нужное место.
     */

    public static void main(String[] args) {
        int[] arrayInt = { 2, 6, 11, 12, 0, 7, 5, 1 };
        selectionSort(arrayInt);
        for (int i : arrayInt) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] array){
        for(int i = 0, temp;i<array.length;i++){
            int minIndex = findMin(array, i);
            temp = array[0+i];
            array[0+i] = array[minIndex];
            array[minIndex] = temp;
        }

    }

    public static int findMin(int[] array, int offset){
        int minNumIdx = offset;
        for (int i = offset; i< array.length;i++){
            if(array[minNumIdx] > array[i]){
                minNumIdx = i;
            }
        }
        return minNumIdx;
    }
}
