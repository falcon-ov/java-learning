package tasks.basics.exceptions;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            throw new IllegalArgumentException("negative numbers arent allowed");
        }
    }
}
