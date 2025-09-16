import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        // String array[]=new String[size];
        // int totalLength=0;
        // for(int i=0;i<size;i++){
        //     array[i]=sc.next();
        //     totalLength+=array[i].length();
        // }
        // System.out.println("Total length of all strings: "+totalLength);
        String str=sc.next();
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result+='i';
            }
            else{
                result+=str.charAt(i);
            }
        }
        System.out.println("New String: "+result);

    }
   
    
}
