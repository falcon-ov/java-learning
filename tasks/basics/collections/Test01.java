package tasks.basics.collections;

import java.util.ArrayList;

//Напишите программу, которая создаёт массив из 5 чисел и 
//копирует его элементы в ArrayList, затем добавляет новый элемент в список.
public class Test01 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            arrList.add(i);
        }
        arrList.add(6);
        System.out.println(arrList);
    }
}
