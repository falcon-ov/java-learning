package tasks.basics.exceptions;

// ArrayIndexOutOfBoundsException
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
