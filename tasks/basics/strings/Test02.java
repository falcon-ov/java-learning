package tasks.basics.strings;

public class Test02 {
    public static void main(String[] args) {
        /// Напишите программу, которая использует StringBuilder
        /// для создания строки из списка слов (например, ["Java", "is", "awesome"]),
        /// добавляя пробелы между ними.
        StringBuilder str1 = new StringBuilder();
        String[] strings = { "Java", "is", "awesome" };
        for (String item : strings) {
            str1.append(item + " ");
        }
        System.out.println(str1);

        // Создайте программу, которая принимает строку,
        // переворачивает её с помощью StringBuilder и проверяет,
        // является ли она палиндромом (например, "radar").
        System.out.println(isPalindrome("radar"));
    }
    public static boolean isPalindrome(String str){
        StringBuilder string = new StringBuilder(str);
        return string.reverse().equals(string);
    }
}
