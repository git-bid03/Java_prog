import java.util.*;
public class Hashy{

    public static void main(String[] args){
        int[] arr={1,1,2,2,4,3,4,4,5,4,6,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int el:arr){
            if(!map.containsKey(el)){
                map.put(el,1);
            }else{
                map.put(el,map.get(el)+1);
            }
        }
        System.out.println("Frequency map: ");
        System.out.println(map.entrySet());
        int maxFreq=0,ansKey=-1;
        for(var e:map.entrySet()){
            if(e.getValue()>maxFreq) 
            {maxFreq=e.getValue();
            ansKey=e.getKey();
        }
        }
        System.out.println(ansKey);
    }
}