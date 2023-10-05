import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class primeNumber {

    static void prime(int n){
int i, sum=0;
        for (i=1;i<=n;i++){
            int  count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i+" ");
                 sum += i;
            }

        }
      System.out.println("total sum of prime number"+sum);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter prime number");

        int n = sc.nextInt();
        System.out.println(" the prime number 1 to "+n+" are");

//////// calculate square root of prime number
//        if (n==2){
//            double s =Math.sqrt(n);
//            System.out.println("the square root of prime number is "+n+ " is "+String.format("%.2f",s));
//
//        } else if (n%2==0) {
//
//            System.out.println("this is not a prime no,");
//        }
//
//        else  {
//            double s =Math.sqrt(n);
//            System.out.println("the square root of prime number is "+n+ " is "+String.format("%.2f",s));
//        }
///////// find prime number

prime(n);
    }

}