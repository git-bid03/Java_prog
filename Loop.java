import java.util.*;
public class Loop {
    public static void main(String args[]){
        System.out.println("Enter value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    
}
