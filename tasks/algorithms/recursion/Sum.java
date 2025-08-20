package tasks.algorithms.recursion;
import tasks.algorithms.utils.ArrayUtils;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        return arr[0] + sum(ArrayUtils.array_remove(arr, 0));
    }
}
