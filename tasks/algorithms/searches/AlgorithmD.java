package tasks.algorithms.searches;

import java.util.ArrayList;
import java.util.HashMap;

public class AlgorithmD {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        graph.put("start", new HashMap<>());
        graph.put("a", new HashMap<>());
        graph.put("b", new HashMap<>());
        graph.put("fin", new HashMap<>());

        graph.get("start").put("a", 6);
        graph.get("start").put("b", 2);
        graph.get("a").put("fin", 1);
        graph.get("b").put("a", 3);
        graph.get("b").put("fin", 5);

        int infinity = Integer.MAX_VALUE;
        HashMap<String, Integer> costs = new HashMap<>();
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", infinity);

        HashMap<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        ArrayList<String> processed = new ArrayList<>();

        // Dijkstra’s algorithm starts here <--
        String node = findLowestCostNode(costs, processed);
        while (node != null) {
            int cost = costs.get(node);
            HashMap<String, Integer> neighbors = graph.get(node);

            if (!neighbors.isEmpty()) {
                for (String n : neighbors.keySet()) {
                    int new_cost = cost + neighbors.get(n);
                    if (costs.get(n) > new_cost) {
                        costs.put(n, new_cost);
                        parents.put(n, node);
                    }
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }
        System.out.println("MinWeightPath - "+costs.get("fin"));
        String temp = "fin";
        while (temp != null) {
            System.out.print(temp);
            temp = parents.get(temp);
            if(temp != null){
                System.out.print(" <- ");
            }
        }
        System.out.println();
    }

    public static String findLowestCostNode(HashMap<String, Integer> costs, ArrayList<String> processed) {
        int minValue = Integer.MAX_VALUE;
        String minKey = null;
        for (HashMap.Entry<String, Integer> cost : costs.entrySet()) {
            if (cost.getValue() < minValue && !processed.contains(cost.getKey())) {
                minValue = cost.getValue();
                minKey = cost.getKey();
            }
        }
        return minKey;
    }
}
