import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int m=sc.nextInt();
        sc.close();
        //Solid rectangle
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Hollow rectangle
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || j==1 || i==4 || j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Half Pyramid
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Inverted HP
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //Rotated by 180 degree hp
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //              System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //     System.out.println();
    // }
    //hp with numbers
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    //Inverted hp with numbers
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    //Floyd's Triangle
    // int number=1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(number+" ");
    //         number++;
    //     }
    //     System.out.println();
    // }
    //0-1 Triangle
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         int sum=i+j;
    //         if(sum %2==0){
    //             System.out.print("1 ");
    //         }
    //         else{
    //             System.out.print("0 ");
    //         }
    //     }
    //     System.out.println();
    // }
    //Solid rhombus
    // for(int i=1;i<=n;i++){
    //     //front space
    //     for(int j=1;j<=n-(i-1);j++){
    //         System.out.print(" ");
    //     }//star
    //     for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //     }//later space
    //     for(int j=1;j<=i-1;j++){
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }
    //Number pyramid
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }
    //Butterfly Pattern
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=1;j<=2*(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=1;j<=2*(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //Palindromic Pattern
    // for(int i=1;i<=n;i++){
    //     for (int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i;j>=1;j--){
    //         System.out.print(j);
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     for (int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }
    //Diamond
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=2*i-1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=2*i-1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //Hollow Butterfly
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             //for stars and spaces
//             if(j==1 || j==i){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         //to print spaces dec by 2
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             //for stars and spaces
//             if(j==1 || j==i){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//  for(int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             //for stars and spaces
//             if(j==1 || j==i){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//          for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             //for stars and spaces
//             if(j==1 || j==i){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//Hollow rhombus
// for(int i=1;i<=n;i++){
//     //front space
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//         if(i==1 || i==n || j==1 || j==n){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
    //Pascal's Triangle
    for(int i=1;i<=n;i++){
        //front space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //number
        for(int j=1;j<=i;j++){
            if((i%2!=0 && j%2!=0) || (i%2==0 && j%2==0)){
                System.out.print();
            }
            }
        }
    }
  }
}