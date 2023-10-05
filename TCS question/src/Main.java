import java.util.Scanner;

public class Main {
    static int factorial(int n){
        int sum =1;
        int i;
        for ( i=1 ;i<=n;i++)
        {
            sum *=i;
        }


        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

 System.out.println(factorial(n));
    }
}