import java.util.Scanner;
public class patternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//pattern printing in rectangular pattern
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=c ;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//print star in border rectangular

//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=c ;j++){
//                if (i==1||i==r || j==1 ||j==c){
//                System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//   triangle pattern


//        int r = sc.nextInt();
//
//
//        for (int i = 1;i<=r;i++){
//            for (int j=1;j<=i;j++){
//
//                    System.out.print("*");
//
//            }
//            System.out.println();
//        }
//   triangle pattern reverse

//        int r = sc.nextInt();
//
//
//        for (int i = 1;i<=r;i++){
//            for (int j=i;j<=r;j++){
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

// pyramid triangle
//        int  r = sc.nextInt();
//        for(int i =1 ;i<=r;i++ ){
//            //print space
//            for(int j =1;j<=r-i;j++){
//                System.out.print(" ");
//            }
//            //print star
//            for (int k=1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//numerical rectangle pattern
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        for (int i=1;i<=r;i++){
//            for (int j=i;j<=c ;j++){
//                System.out.print(j);
//            }
//           for (int k=1;k<=i-1;k++) {
//               System.out.print(k);
//           }
//            System.out.println();
//        }

//numerical border rectangle pattern
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=c ;j++){
//                if (i==1||i==r || j==1 ||j==c){
//                System.out.print(j);
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //try this 121212
        //         212121
        //         121212
        //         212121
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        for (int i = 1; i <= r; i++) {
//            for (int j = 1; j <= c; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print(1);
//                } else {
//                    System.out.print(2);
//                }
//
//            }
//            System.out.println();
//
//        }

//hollow pyramid
        int k=0;
        int  r = sc.nextInt();
        for(int i =1 ;i<=r;i++ ){
            //print space
            for(int j =1;j<=r-i;j++){
                System.out.print(" ");
            }
            //print star
            for ( k=1;k<=2*i-1;k++){
                if(k==1|| k==2*i-1){
                    System.out.print(i);
                }else{
                System.out.print(" ");
            }}
            k=0;
            System.out.println();
        }

        for (int i=8;i<2*r-1;i++)
            System.out.print(i);

    }}