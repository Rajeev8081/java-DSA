import java.util.Scanner;

public class keypadcombination {
    static void combination(String digit , String kp[], String result){//253 =>kp[2]
        if (digit.length()==0){
            System.out.print(result +" ");
            return;
        }
        int currNum = digit.charAt(0) - '0'; //2

        String currchoise = kp[currNum]; //"abc"
        for (int i=0 ; i< currchoise.length();i++){
            combination(digit.substring(1),kp,result+currchoise.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String digit = sc.next();
        //           0  1   2      3     4     5     6      7      8     9
        String kp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuvw","xyz"};
        String result="";
        combination(digit,kp,result);
    }
}
