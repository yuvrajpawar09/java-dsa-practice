package array1.search;

public class findindex {
    public static int indexofkey(int numbers[], int key){
        for (int i=0; i< numbers.length; i++){
            if(numbers[i]==key){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {1, 2, 3, 6, 10, 12};
        int key = 10;
        indexofkey(numbers,key);

        int index = indexofkey(numbers, key);
        System.out.println(index);
    }
}
