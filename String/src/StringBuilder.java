import java.util.*;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        for (int i=0;i<str.length();i++){
            boolean flag= true;
            char ch = str.charAt(i);
            if (ch==' ')continue;
            int ascii = (int)ch;
            if (ascii>=97)flag = false;
            if (flag==true){
                ascii +=32;
                char dh =(char)ascii;
                str= str.substring(0, i) + dh + str.substring(i+1);
            }else {
                ascii -=32;
                char dh = (char) ascii;
                str= str.substring(0, i) + dh + str.substring(i+1);

            }
        }
        System.out.println(str);
    }
}
