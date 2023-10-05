import java.util.Scanner;

public class printSubsequenceOccurance {
    static void printsubsequenceoccurance( String s , String currAns){
        // base case
        if (s.length()==0){
            System.out.println(currAns);
            return;
        }
        //self work
        char current = s.charAt(0);
        String remString =s.substring(1);
        //recursion
        //
        printsubsequenceoccurance(remString,currAns+current);

        printsubsequenceoccurance(remString,currAns);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String currAns =" ";
        printsubsequenceoccurance(s,currAns);


    }
}
