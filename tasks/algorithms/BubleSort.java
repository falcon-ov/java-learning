package tasks.algorithms;

/*
Bubble Sort (пузырьковая сортировка)

Сравниваем каждую пару соседних элементов и меняем местами, 
если они идут в неправильном порядке. 
Повторяем проходы по массиву, пока весь массив не отсортируется.
Много проходов → «всплывают» большие элементы.

 */
public class BubleSort {
    public static void main(String[] args) {
        int[] arrayInt = { 2, 6, 11, 12, 0, 7, 5, 1 };
        bubleSort(arrayInt);
        for (int i : arrayInt) {
            System.err.println(i);
        }
    }

    public static void bubleSort(int[] array) {
        for (int j = 0;j < array.length ;j++) {
            for (int i = 1, temp; i < array.length - j; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
