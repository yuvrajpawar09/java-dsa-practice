package array1;
import java.util.*;

public class InpOutUpdateArray {
    public static void main(String[] args) {
        int marks[] = new int[100];

        System.out.println("lenght"+ marks.length);

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy" + marks[0]);
        System.out.println("che" + marks[1]);
        System.out.println("math" + marks[2]);

        marks[1] = 100;

        System.out.println("che" + marks[1]);
    }
}
