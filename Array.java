import java.util.*;
public class Array {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int numbers[]=new int[5];
        // for(int i=0;i<5;i++){
        //     numbers[i]=sc.nextInt();
        // }
        // int x=sc.nextInt();
        // sc.close();
        // for(int i=1;i<numbers.length;i++){
        //     if(numbers[i]==x){
        //         System.out.println( x+" found at index " +i);
        //     }
        // }
        // int size=sc.nextInt();
        // String[] names=new String[size];
        // for(int i=0;i<size;i++){
        //     names[i]=sc.next();
        // }
        // //output
        // for(int i=0;i<names.length;i++){
        //     System.out.println("Name at " +i +"is: "+names[i]);
        // }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        sc.close();
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // //max no
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]<min){
        //         min=numbers[i];
        //     }
        //     if(numbers[i]>max){
        //         max=numbers[i];
        //     }
        // }
        //  System.out.println("Largest no in array: "+max);
        // System.out.println("Smallest no in array: "+min);
        //traversal
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<numbers[i+1]){
                System.out.println(numbers[i] + "In ascending order");
            }
            else{
                System.out.println(numbers[i] +" is not in ascending order");
            }
        }
    }
}
