import java.util.Scanner;

public class findFerfectSquarfe {
    static void perfectsquare(int n ){
       int sqrt = (int )Math.sqrt(n);
            if (sqrt*sqrt==n){
                System.out.println("this is a perfect square ");
                System.out.println("given number is square of "+sqrt);

            }else {
                System.out.println("this is not a perfect square");

            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        perfectsquare(n);
    }
}
