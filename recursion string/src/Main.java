import java.util.Scanner;

public class Main {
    //iterative method
    static String removeoccurance(String s, int idx  ){
      if (idx== s.length()) return "";

      String smallans = removeoccurance(s,idx+1);
      char currentchar = s.charAt(idx);

      if (currentchar!='r') {
          return currentchar + smallans  ;
      }else {
          return smallans;
      }

    }
    static  String removeoccurance2approach(String s){
        if (s.length()==0){
            return "";
        }
        //recursion
        String recur = removeoccurance2approach(s.substring(1));
// self work
        // 0 use isliye kiya hai kyuki ham substring ka 0 index hi match karenge baki ka recursion kar dega bar bar
        char currentchar = s.charAt(0);

        if (currentchar!='r') {
            return currentchar + recur ;
        }else {
            return recur;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();



        int idx =0;

        System.out.println(removeoccurance(s,idx));
        System.out.println(removeoccurance2approach(s));
    }
}