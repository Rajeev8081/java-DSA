import java.util.Scanner;


public class FindOutNumberOfDay {
    static void findDays(int b){
        if (b==1){
            System.out.println("jan 31 days");
        }
        if (b==2){
            System.out.println("feb 30 days");
        }
        if (b==3){
            System.out.println("march 31 days");
        }
        if (b==4){
            System.out.println("april 30 days");
        }
        if (b==5){
            System.out.println("may 31 days");
        }
        if (b==6){
            System.out.println("june 30 days");
        }
        if (b==7){
            System.out.println(" july 31 days");
        }
        if (b==8){
            System.out.println("aug  31 days");
        } if (b==9){
            System.out.println("sep 30 days");
        } if (b==10){
            System.out.println("oct 31 days");
        }
        if (b==11){
            System.out.println("nov 30 days");
        }
        if (b==12){
            System.out.println("dec 31 days");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter month");
        int b =sc.nextInt();


findDays(b);
    }
}
