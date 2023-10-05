import java.util.Scanner;

public class findSmallNumber {
    static void smallestnumber(int a,int b, int c){
        if (a<b){
            if (a<c){
                System.out.println("smallest number is "+a);
            }else {
                System.out.println("smallest number is "+c);
            }

        }else {
            if (b <c){

                System.out.println("smallest number is " + b);

            }else {
                System.out.println("smallest number is "+c);

            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");

        int  a = sc.nextInt();;
        int  b = sc.nextInt();;
        int  c = sc.nextInt();;
smallestnumber(a,b,c);
    }
}
