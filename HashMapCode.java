import java.util.*;
public class HashMapCode {
    public static class HashMap<K,V>{//this is called generics in java where we don't know the datatype
    class Node{
    K key;
    V value;
    Node(K key, V value){
        this.key=key;
        this.value=value;
    }
    }
    private int n; //no of nodes
    private int N;//size of array
    private LinkedList<Node> buckets[];//N=buckets.length
    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }
    }
    private int hashFxn(K key){
        int bi=key.hashCode(); //hashCode can be +ve or -ve ..but we want only +ve(0 to N-1)
        return Math.abs(bi)%N;
    }
    private int searchInLL(K key, int bi){
        LinkedList<Node> ll=buckets[bi];
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).key==key){
                return i;
            }
        }
        return -1;
    }
        private void rehash(){
            LinkedList<Node> oldBuckets[]=buckets;
            buckets=new LinkedList[N*2];

            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> ll=oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);

                }
            }        
        }
    public void put(K key,V value){
        int bi=hashFxn(key);
        int di=searchInLL(key,bi);//data idx
        if(di==-1)//key doesn't exist
        {
            buckets[bi].add(new Node(key, value));
            n++;
        }
        else{//key exists
            Node node=buckets[bi].get(di);
            node.value=value;
        }
        double lambda=(double)n/N;
        if(lambda>2.0){
            //rehashing
            rehash();
        }
    }
    public static void main(String args[]){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        map.put("US",100);
    }
}
}
