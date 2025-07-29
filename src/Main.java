import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{6, 4, 1, 2, 9, 7, 8, 2, 3, 2};

        System.out.println(findMin(array));

    }
    // Поиск минимального
    public static int findMin(int[] array){
        int minIndex = 0;
        int minValue = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < array[minIndex]){
                minIndex = i;
                minValue = array[i];
            }
        }

        return minValue;
    }
}