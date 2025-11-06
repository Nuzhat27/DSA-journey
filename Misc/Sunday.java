/*Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input 

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.

Output :

2    -> number of days within 13 days. */
package Misc;
import java.util.*;
class Sunday{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		String[] week = {"mon" , "tue" , "wed" , "thu" , "fri" , "sat" , "sun"};
		int i = 0;
		for(i = 0 ; i < week.length; i ++){
			if(week[i].equals(str)) break;
		}
		
		int daysToFirstSun = 6 - i + 1;
		int sundays = 0;
		if(n >= 7){
			sundays = 1 + (n - daysToFirstSun) / 7;
		}
		
		System.out.println(sundays);
	}
}