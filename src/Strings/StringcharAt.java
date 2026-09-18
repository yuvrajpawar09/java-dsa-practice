package Strings;

public class StringcharAt {
    public static void main(String[] args){
        String name = "abc xyz";
        printchar(name);

    }
    public static void printchar(String name){
        for (int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
}
