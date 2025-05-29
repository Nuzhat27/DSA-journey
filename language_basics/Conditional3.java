package language_basics;

import java.util.Scanner;

/*
 Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
Ensure only the 1st letter of the answer is capitalised.
 */
public class Conditional3 {
    public static void whichWeekDay(int day) {
        switch(day){
        case 1: System.out.print("Monday");
        break;
        case 2: System.out.print("Tuesday");
        break;
        case 3: System.out.print("Wednesday");
        break;
        case 4: System.out.print("Thursday");
        break;
        case 5: System.out.print("Friday");
        break;
        case 6: System.out.print("Saturday");
        break;
        case 7: System.out.print("Sunday");
        break;
        default: System.out.print("Invalid");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number:-");
        int dayNum = sc.nextInt();
        whichWeekDay(dayNum);
        sc.close();
    }
}
