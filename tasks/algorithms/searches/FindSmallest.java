package tasks.algorithms.searches;

public class FindSmallest {
    public static void main(String[] args) {
        int[] array = {9, 3, 5, 8, 1, 6};
        System.out.println(findSmallest(array));
    }
    public static int findSmallest(int[] array){
        if(array.length == 0){
            return -1;
        }
        int smallest = array[0];
        int smallest_index = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
}
