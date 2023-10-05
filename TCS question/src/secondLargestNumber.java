import java.util.Scanner;

public class secondLargestNumber {
    static void secondLargest(int a,int b, int c){
        if (a>=b && a>=c){
           if (b>=c){
               System.out.println("second largest"+b);
           }else {
               System.out.println("second largest"+c);

           }

        }else if (b >=c &&b>=a){
            if (a>=c){

                System.out.println("second largest number is " + a);

            }else {
                System.out.println("second largest number is "+c);

            }


        } else if (a>=b)
            System.out.println("second largest number is "+a);
            else
            System.out.println("second largest number is "+b);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");


        int  a = sc.nextInt();;
        int  b = sc.nextInt();;
        int  c = sc.nextInt();;

        secondLargest(a,b,c);
    }
}
