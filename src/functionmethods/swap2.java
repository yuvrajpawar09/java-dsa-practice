package functionmethods;

public class swap2 {
    public static int addition(int a, int b){
        int temp =  a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        return 0;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 10;
        addition(a,b);
    }
}
