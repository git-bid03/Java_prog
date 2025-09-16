import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        int temp=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            temp++;
            }
        }
        if(temp==2){
            System.out.println("It is prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
