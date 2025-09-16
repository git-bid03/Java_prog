// import java.util.HashMap;
import java.util.*;
public class MyHashMapExample {
    public static void main(String args[]){
        //country(key),population(value)
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
        System.out.println(map.get("India"));
        System.out.println(map.get("Myanmar"));
    
        int arr[]={12,15,18};
        for(int val:arr){
            System.out.print(val+" ");
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String>keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("China");
        System.out.println(map);
    }
}
