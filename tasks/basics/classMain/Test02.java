package tasks.basics.classMain;

import java.util.Random;

//Напишите программу, которая создает массив из 10 случайных чисел и выводит их сумму.
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
            sum += arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sum of arr: "+sum);
    }
}
