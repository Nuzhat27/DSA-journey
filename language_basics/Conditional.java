package language_basics;
import java.util.*;
public class Conditional {
    public static void isAdult(int age) {
        if(age>=18){
            System.out.print("Adult");
        }
        else{
            if(age<18){
                System.out.print("Teen");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:-");
        int age = sc.nextInt();
        isAdult(age);
    }
}


