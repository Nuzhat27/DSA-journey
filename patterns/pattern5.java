package patterns;

import java.util.Scanner;

public class pattern5 {
    public void printPattern5(int n) {
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int n = sc.nextInt();
        printPattern5(n);
    }
}
