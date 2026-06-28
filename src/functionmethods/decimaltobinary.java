package functionmethods;

public class decimaltobinary {
    public static void binary(int n){
        int pow = 0;
        int binaryno=0;
        while(n>0){
            int rem = n%2;
            binaryno = binaryno + rem * (int)Math.pow(10,pow);
            n /= 2;
            pow++;
        }
        System.out.println(binaryno);
    }
    public static void main(String[] args){
        binary(10);
    }
}
