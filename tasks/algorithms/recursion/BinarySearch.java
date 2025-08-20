package tasks.algorithms.recursion;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 4, 0, arr.length-1));
    }

    public static int binarySearch(int[] arr, int value, int low, int high){
        int middle = (low+high)/2;
        if(arr[middle] == value) return middle;
        if(arr[middle] < value) 
            return binarySearch(arr, value, middle+1, high);
        if(arr[middle] > value)
            return binarySearch(arr, value, low, middle-1);
        return -1;
    }
}
