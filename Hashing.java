import java.util.HashSet;
import java.util.Iterator;
public class Hashing{
    public static void main(String args[]){
        //creation
        HashSet<Integer> set=new HashSet<>();
        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("Size of set is: "+set.size());
        //print all elements
        System.out.println(set);
        //search
        if(set.contains(1)){
            System.out.println("contains...");
    }
    if(!(set.contains(6))){
        System.out.println("does not contain...");
    }
    //delete
    set.remove(1);
    if(!(set.contains(1))){
        System.out.println("Deleted...");
    }
    //iterator
    Iterator<Integer> it=set.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
}
}