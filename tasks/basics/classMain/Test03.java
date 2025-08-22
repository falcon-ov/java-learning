package tasks.basics.classMain;

//Создайте двумерный массив 3x3, заполните его числами 
// от 1 до 9 и выведите его в виде таблицы.
public class Test03 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int num = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
