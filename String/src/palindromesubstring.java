import java.util.Scanner;

public class palindromesubstring {
    static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (palindrome(str.substring(i,j))==true){
                    System.out.println(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\n the total palindrome is "+count);
    }
}
