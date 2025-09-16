import java.util.*;
public class HashMap2 {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kunal", 88);
        map.put("Karan", 98);
        map.put("Rahul", 80);
        // System.out.println(map.get("Karan"));
        // System.out.println(map.getOrDefault("Apoorv",78));
        // System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        System.out.println(set);
    }
}
