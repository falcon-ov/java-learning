package tasks.algorithms.hash_tables;
import java.util.HashMap;

public class CheckVoter {
    public static void main(String[] args) {
        HashMap<String, Boolean> voted = new HashMap<>();
        voted.put("Ivan", true);
        checkVoter(voted, "Vasea");
        checkVoter(voted, "Vasea"); 
        checkVoter(voted, "Ivan");
    }
    public static void checkVoter(HashMap<String, Boolean> voted, String name){
        if(voted.get(name) != null){
            System.out.println(name + " - уже голосовал!");
            return;
        }
        voted.put(name, true);
        System.out.println(name + " - еще не голосовал!");
        return;
    }
}
