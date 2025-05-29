package language_basics;
import java.util.Scanner;

/*
 Given a string s. Return the last character of the given string s.
Examples:
Input : s = "takeuforward"
Output : d
Explanation : The last character of given string is "d".
 */
public class GetLastCharacter {
    public static char lastChar(String s) {
        return s.charAt(s.length()-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:-");
        String s = sc.nextLine();
        char ch = lastChar(s);
        System.out.print("Last character:-" + ch);
        sc.close();
    }
}
