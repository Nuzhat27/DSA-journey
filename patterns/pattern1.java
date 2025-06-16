package patterns;
/*
 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
*****
*****
*****
*****
*****
Print the pattern in the function given to you.
 */
import java.util.*;
class pattern1 {
    public static void printPattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int n = sc.nextInt();
        printPattern1(n);
    }
}
