package tasks.algorithms.searches;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class InWidthSearch {
    public static void main(String[] args) {
        // you -> James, John, Nik;
        // James -> Oliver
        // John -> Oliver
        // Nik -> Dan
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        graph.put("You", new ArrayList<>(Arrays.asList("James", "John", "Nik")));
        graph.put("James", new ArrayList<>(Arrays.asList("Oliver")));
        graph.put("John", new ArrayList<>(Arrays.asList("Oliver")));
        graph.put("Nik", new ArrayList<>(Arrays.asList("Dan M")));
        search(graph, "You");
    }

    public static void search(HashMap<String, ArrayList<String>> graph, String name) {
        Deque<String> searchDeque = new ArrayDeque<>();
        ArrayList<String> arrList = graph.get(name);
        for (String item : arrList) {
            searchDeque.addLast(item);
        }
        ArrayList<String> searched = new ArrayList<>();
        while (!searchDeque.isEmpty()) {
            String person = searchDeque.pollFirst();
            if (!searched.contains(person)) {
                if (personIsSeller(person)) {
                    System.out.println(person + " - продавец манго!!!");
                    return;
                } else {
                    System.out.println(person + " - не продавец манго((");
                    searched.add(person);
                    if (graph.get(person) == null)
                        continue;

                    ArrayList<String> tempList = graph.get(person);
                    for (String item : tempList) {
                        searchDeque.addLast(item);
                    }
                }
            }
        }
        System.out.println("Продавец манго не найден!");
    }

    public static boolean personIsSeller(String name) {
        if (name.charAt(name.length() - 1) == 'M') {
            return true;
        }
        return false;
    }
}
