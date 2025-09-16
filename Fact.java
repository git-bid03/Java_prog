public class Fact {
    public static int calcFact(int n){

        if(n==1 || n==0){
            return 1;
        }
        int factnm1=calcFact(n-1);
        int factn=n*factnm1;
        return factn;
    }
    public static void main(String args[]){
        int n=5;
        int ans=calcFact(n);
        System.out.println(ans);
    }
}
