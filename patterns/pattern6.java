package patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int n = sc.nextInt();
        printPattern6(n);
    }
    public void printPattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
