import java.util.Scanner;

public class PascalTriangle {
    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n) {
        //firstly intilize a answer array
        //int his array row are define but column are not define
        int[][] answer = new int[n][];

        for (int i = 0; i < n; i++) {
            //ith row has i+1 columns so,
            answer[i] = new int[i + 1];
            //1st ans last element of every row is 1
            answer[i][0] = answer[i][i] = 1;

            //sum of upper value and left side of upper value
            for (int j = 1; j < i; j++) {
                answer[i][j] = answer[i - 1][j] + answer[i - 1][j - 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        printarray(ans);
    }
}
