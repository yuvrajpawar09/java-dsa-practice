package functionmethods;

public class funcoverlaoding {
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String [] args){
        System.out.println(sum(4,5));
        System.out.println(sum(5,6,8));
        System.out.println(sum(5.2f,5.6f));
    }

}
