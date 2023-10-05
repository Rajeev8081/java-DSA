import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter princile");
        float p = sc.nextFloat();


        System.out.println("enter rate of interest");
        float r=sc.nextFloat();

        System.out.println("enter time");
        float t=sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("principle "+p);
        System.out.println("rate "+r);
        System.out.println("time "+t);

        System.out.println("simple interest "+si);
    }
}
