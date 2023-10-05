import  java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//     int sum=0;
//     while (i<=n){
//         sum = i+sum;
//         System.out.println(i);
//         i++;
//     }System.out.println(sum);
//    }
//}
//for loop

//
//        for (int i = 10; i >= n; i-=2) {
//            System.out.println(i);
//
//        }
//        dowhile loop
//   int i=7;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=n);
//q.2 print the sum of the stream of integer in the input


         int sum= 0;
        while(n != -1){
            sum += n;
            n= sc.nextInt();

        }
        System.out.println(sum);

    }
}



