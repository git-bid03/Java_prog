public class Recursion3 {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String str, int idx,String newstr){
        char currChar=str.charAt(idx);
        if(idx==str.length()-1){
            System.out.println(newstr);
            return;
        }
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newstr);
        }else{
            newstr+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newstr);
        }
    }
    public static void main(String args[]){
        String str="abbabccba";
        removeDuplicates(str, 0, " ");
    }
}
