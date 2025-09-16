import java.util.*;
public class SumOdd{
    public static int printOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%2!=0){
                sum=sum+i;
                return sum;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("Sum of all odd nos: "+printOdd(n));
    }
}