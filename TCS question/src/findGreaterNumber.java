import java.util.Scanner;

public class findGreaterNumber {
    static void greatestnumber(int a,int b, int c){
        if (a>b){
            if (a>c){
                System.out.println("largest number is "+a);
            }else {
                System.out.println("largest number is "+c);
            }

        }else {
            if (b >c){

                    System.out.println("largest number is " + b);

            }else {
                System.out.println("largest number is "+c);

            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");

        int  a = sc.nextInt();;
        int  b = sc.nextInt();;
        int  c = sc.nextInt();;

        greatestnumber(a,b,c);
    }
}
