import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int binary_num = sc.nextInt();
//         int ans = 0;
//         int powerofTwo = 1;
//
//                while(binary_num>0){
//                    int unit_digit = binary_num%10;
//                    ans += (unit_digit * powerofTwo);
//                    binary_num /=10;
//                    powerofTwo = powerofTwo*2;
//                }
//                System.out.println(ans);


//decimal to binary
int decimal_number =  sc.nextInt();
  int ans = 0;
  int pw=1;
        while (decimal_number > 0) {

            int parity = decimal_number%2;
            ans += (parity * pw);
            pw *= 10;
            decimal_number /=  2;
        }
        System.out.println(ans);
    }
}
