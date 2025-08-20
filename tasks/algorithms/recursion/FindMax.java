package tasks.algorithms.recursion;
import tasks.algorithms.utils.ArrayUtils;

public class FindMax {
    
    public static void main(String[] args) {
        int[] arr = {22, 4, 6, 10};
        System.out.println(findMax(arr, 0));
    }

    public static int findMax(int[] arr, int maxValue){
        if(arr.length == 0) return maxValue;
        if(arr[0] > maxValue){
            maxValue = arr[0];
        }
        return findMax(ArrayUtils.array_remove(arr, 0), maxValue);
    }
}
