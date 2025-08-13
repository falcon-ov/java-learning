package tasks.algorithms.searches;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(binarySearch(array, 8));
    }

    public static int binarySearch(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;
        int midElement;
        while (low <= high) {
            int mid = (low + high) / 2;
            midElement = array[mid];
            if(midElement == num){
                return mid;
            } else if(midElement > num){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
