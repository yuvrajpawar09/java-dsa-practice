package functionmethods;

public class binarytodecimal {
    public static void decimal(int n){
        int pow = 0;
        int decnum=0;

        while(n > 0){
            int lastdigit = n%10;
            int lastdec = lastdigit * (int)Math.pow(2,pow);
            decnum += lastdec;
            n /= 10;
            pow++;
        }
        System.out.println(decnum);
    }
    public static void main(String[] args){
        decimal(1000);
    }
}
