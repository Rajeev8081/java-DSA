import java.util.Scanner;
public class loopsproblem {
    public static void main(String[] args) {
//count  the no. digit
   Scanner sc = new Scanner(System.in);
//   int n = sc.nextInt();
//        int storedigit=0;
//   while (n>0){
//       n=n/10;
//       storedigit++;
//   }
//   System.out.println("number of digit "+storedigit);


//find the sum of digit in a given number n;
//        int n= sc.nextInt();
//         int sum= 0;
//        while (n>0){
//            sum += n%10;
//            n=n/10;
//        }
//        System.out.println(sum);




 //reverse the no. of digit
//int  n = sc.nextInt();
//int ans =0;
//int reverse= 0;
//while (n>0){
//    ans =ans*10+n%10;
//    n=n/10;
//
//}
//System.out.println(ans);



//        find the sum of following series

//int n = sc.nextInt();
//int sum=0;
//for (int i=1;i<=n;i++){
//    if (i%2==0){
//        sum -= i;
//    }else {
//        sum += i;
//    }
//        }
//System.out.println(sum);



//print the first n factorial numbers

//int n =  sc.nextInt();
//int store= 1;
//for (int i=1;i<=n;i++){
//
//
//        store = store*i;
//
//}
//System.out.println(store);


//given 2 no. A and B . find a raise to the power b
int a = sc.nextInt();
int b = sc.nextInt();
int result= 1;
for (int i=1;i<=b;i++){
     result =result*a;
}
System.out.println(result);

    }

}

