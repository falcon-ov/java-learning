package tasks.basics.strings;

public class Test01 {
    public static void main(String[] args) {
        String string = "JavaSE";
        System.out.println(startWithJava(string));
        String string2 = "  javajava    ";
        System.out.println(toUpperTrim(string2));
        String string3 = "012test7";
        System.out.println(isTest3to7idx(string3));
    }

    // Напишите программу, которая принимает строку и проверяет,
    // начинается ли она с подстроки "Java" (используйте indexOf или startsWith).
    public static boolean startWithJava(String string) {
        return string.startsWith("Java");
    }

    // Создайте программу, которая запрашивает строку и заменяет все её символы в
    // нижнем регистре на верхний, а затем обрезает пробелы с помощью trim.
    public static String toUpperTrim(String str) {
        return str.toUpperCase().trim();
    }
    // Напишите программу, которая извлекает из строки все символы между
    // 3-м и 7-м индексами и проверяет, равна ли эта подстрока слову "test".
    public static boolean isTest3to7idx(String str){
        return str.substring(3, 7).equals("test");
    }
}
