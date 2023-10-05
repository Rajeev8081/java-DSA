import java.util.Scanner;

public class areaOFcircle {
    static void diameter(double n){
        double pi = 3.14;
        n=n/2;
        double area =pi*n*n;
     System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter diameter");
        int n= sc.nextInt();
diameter(n);
    }

}
