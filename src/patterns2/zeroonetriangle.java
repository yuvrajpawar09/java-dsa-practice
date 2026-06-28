package patterns2;

public class zeroonetriangle {
    public static void pattrn(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else if((i+j)%2!=0){
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattrn(5);
    }
}
