package loops;
import java.util.Scanner;
public class breakstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the number");
            int i = sc.nextInt();
            if (i==10){
                break;
            }else{
                System.out.println(i);
            }
        }while(true);
    }
}
