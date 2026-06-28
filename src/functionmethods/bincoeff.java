package functionmethods;

public class bincoeff {
    public static int fact(int n){
        int f=1;

        for (int i=1; i<=n; i++){
            f = f* i;
        }
        return f;
    }

    public static int bin(int n, int r){
        int factn = fact(n);
        int factr = fact(r);
        int factnmr = fact(n-r);

        int binc= factn / (factr*factnmr);
        return binc;
    }

    public static void main(String[] args){
        System.out.println(bin(5,2));

    }
}
