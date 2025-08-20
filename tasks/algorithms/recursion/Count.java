package tasks.algorithms.recursion;
import tasks.algorithms.utils.ArrayUtils;

public class Count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(count(arr));
    }

    public static int count(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        return 1 + count(ArrayUtils.array_remove(arr, 0));
    }
}
