package functionmethods;

public class multiply {
    public static int multi(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args){
        int prod = multi(4, 5);
        System.out.println(prod);
    }
}
