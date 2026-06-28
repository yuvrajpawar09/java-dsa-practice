package patterns2;

public class hollowrectangle {
    public static void hollow(int rows, int colms){
        for (int i=1; i<= rows; i++){
            for(int j=1; j<=colms; j++){
                if(i==1||i==rows||j==1||j==colms){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollow(4,5);
    }

}
