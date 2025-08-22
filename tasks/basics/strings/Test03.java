package tasks.basics.strings;

//Напишите программу, которая сравнивает производительность: сложите 1000 строк
//с помощью String (через +) и StringBuilder (через append), измерьте время выполнения.
public class Test03 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            str1.append("string" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Время (мс) " + (end - start));
        //
        start = System.currentTimeMillis();

        String string1 = "";
        for (int i = 0; i < 100000; i++) {
            string1 += "string"+i;
        }
        end = System.currentTimeMillis();
        System.out.println("Время (мс) " + (end - start));
    }
}
