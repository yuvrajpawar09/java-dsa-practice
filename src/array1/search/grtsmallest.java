package array1.search;

public class grtsmallest {
    public static int findsmallest(int numbers[]){
        int smallest= Integer.MAX_VALUE;

        for (int i=0; i<numbers.length; i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        int numbers[] = {2, 6, 5, 8, 10};
        System.out.println(findsmallest(numbers));
    }
}
