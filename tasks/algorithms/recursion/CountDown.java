package tasks.algorithms.recursion;

public class CountDown {
    public static void main(String[] args) {
        countDown(10);
    }
    public static void countDown(int i){
        System.out.println(i);
        if (i <= 0){
            return;
        } else{
            countDown(i-1);
        }

    }
}
