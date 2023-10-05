import java.util.Scanner;

public class squarenumber {
    static int Squarenumber(int p, int q){
        if (q==0) return 1;

        //recursion
        int recur =Squarenumber(p,q-1);
        //self work
        int ans = recur * p;
        return ans;
    }
    static int powerofnumber(int p,int q){
        if (q==0) return 1;
        // recursion
        int smallvalue = powerofnumber(p,q/2);
        if (q%2==0){//even
            return  smallvalue * smallvalue;
        }
        return  smallvalue * smallvalue * p;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
//        System.out.println(Squarenumber(p,q));
        System.out.println(powerofnumber(p ,q));
    }}
