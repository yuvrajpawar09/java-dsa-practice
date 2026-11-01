package BitManipulation;

public class oddOReven {
    public static void check(int n){
        int maskbit = 1;
        if((n&maskbit)==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args){
        check(4);
        check(8);
        check(11);
    }
}
