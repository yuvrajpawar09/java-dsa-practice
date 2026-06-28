package array1.search;
import java.util.*;

public class getlargest {
    public static int findlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for (int i= 0; i < numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int numbers[] = {1, 2, 3, 4, 8, 6, 7};
        System.out.println(findlargest(numbers));
    }
}
