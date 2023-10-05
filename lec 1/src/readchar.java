import  java.util.Scanner;
public class readchar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch= sc.next().charAt(2);
        System.out.println("this is character "+ch);
    }
}
