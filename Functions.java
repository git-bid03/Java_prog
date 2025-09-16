import java.util.*;
public class Functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     String name=sc.next();
    //     sc.close();

    //     printMyName(name);
    // }
    // public static int mulFxn(int a,int b){
    //     int mul=a*b;
    //     return mul;
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //         int a=sc.nextInt();
    //         int b=sc.nextInt();
    //         sc.close();
    //         int mul= mulFxn(a,b);
    //         System.out.println("Product of 2 nos: "+mul);
    //     }
    public static void factNo(int n){
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int fact=1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.close();

            factNo(n);
    }
}

