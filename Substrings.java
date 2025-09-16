import java.util.HashSet;

public class Substrings {
  public static void printSubseq(String str, int idx, String res,HashSet<String> set) {
if(idx == str.length()) {
  if(set.contains(res)){
    return;
  }else{
System.out.println(res);
set.add(res);
return;
}
}
//choose
printSubseq(str, idx+1, res+str.charAt(idx),set);
//don't choose
printSubseq(str, idx+1, res,set);
  }
public static void main(String args[]) {
String str1 = "aaa";
HashSet<String> set=new HashSet<>();
printSubseq(str1, 0, "",set);
}
}
