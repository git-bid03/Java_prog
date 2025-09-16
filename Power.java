public class Power {
    public static int calcPow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xPownm1 =calcPow(x,n-1);
        int xPown= x*xPownm1;
        return xPown;
    }
    public static void  main(String args[]){
        int x=2,n=5;
        int ans=calcPow(x,n);
        System.out.println(ans);
    }
}
