package patterns2;

public class invrothalfpyramid {
    public static void pattern(int rows){
        for (int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(4);
    }
}
