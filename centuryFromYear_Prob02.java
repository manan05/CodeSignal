package CodeSignal;

import java.util.Scanner;

public class centuryFromYear_Prob02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		
		int year = scn.nextInt();
		System.out.println(solution(year));
	}
	public static int solution(int year) {
		if(year%100 == 0) {
			return (year/100);
		}
		return ((year/100)+1);
	}

}
