public class Recursion2 {
//     public static int first=-1;
//     public static int last=-1;

//     public static void findOccurence(String str,int idx,char elt){
//         char currChar=str.charAt(idx);
//         if(idx==str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         if(currChar==elt){
//             if(first == -1){
//                 first=idx;
//             }
//             else{
//                 last=idx;
//             }
//         }
//         findOccurence(str,idx+1,elt);
//     }
//     public static void main(String args[]){
//         String str="bacdaafgeah";
//         findOccurence(str,0,'a');
//     }
public static void moveAllX(String str,int idx,int count,String newstr){
    char currChar=str.charAt(idx);
    if(idx==str.length()-1){
        for(int i=0;i<count;i++){
            newstr+='x';
        }
        System.out.println(newstr);
        return;
    }
    if(currChar=='x'){
        count++;
        moveAllX(str,idx+1,count,newstr);
    }
    else{
        newstr+=currChar;
        moveAllX(str,idx+1,count,newstr);
    }

}
public static void main(String args[]){
    String str="axbxcxcc";
    moveAllX(str,0,0," ");
}
}
