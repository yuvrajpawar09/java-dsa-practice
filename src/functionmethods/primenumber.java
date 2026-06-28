package functionmethods;

public class primenumber {
    public static boolean isprime(int n){
        if (n==1 || n==2) {
            return true;
        }
            for (int i=2; i<=n-1; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args){
        System.out.println(isprime(12));
    }
}
