import java.util.Scanner;
public class conditionstatement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int num = sc.nextInt();
//       if(num %2==0){
//           System.out.println("this is a even number");
//       } else if (num ==  3) {
//           System.out.println("this is a prime num");
//       }else{
//           System.out.println("this is a odd num");
//       }


//        ternary operator
        String result;
        result=(num %2==0)?"even":"odd";
        System.out.println(result);


    }
}
