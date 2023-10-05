import java.util.Scanner;

public class HCF {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("print two number");

    int n= sc.nextInt();
    int n1= sc.nextInt();

            int i,hcf=0;

            for (i =1 ;i<=n ;i++){
                if (n%i==0&&n1%i==0)
                hcf = i;

            }
            System.out.println(hcf);


}
}
