package patterns;
/*
  Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
1
12
123
1234
12345
 */
import java.util.*;
public class pattern3 {
    public void printPattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int n = sc.nextInt();
        printPattern3(n);
    }
}
