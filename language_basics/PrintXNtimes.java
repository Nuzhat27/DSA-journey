package language_basics;
/*
 Given two integers X and N, print the value X on the screen N times. Move to the next line after printing, even if N = 0.
Examples:
Input: X = 7, N = 5
Output: 7 7 7 7 7
 */
import java.util.Scanner;

public class PrintXNtimes {
    public static void printX(int X, int N) {
        while(N>0){
            System.out.print(X+" ");
            N--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X:-");
        int X = sc.nextInt();
        System.out.println("Enter the value of N:-");
        int N = sc.nextInt();
        printX(X,N);
        sc.close();
    }
}
