package BitManipulation;

public class UpdateIthBit {
    public static int update(int n, int i, int newbit){
        int maskbit = newbit << i;
        return n | maskbit;
    }
    public static void main(String[] args){
        System.out.println(update(10,2,1));
    }
}
