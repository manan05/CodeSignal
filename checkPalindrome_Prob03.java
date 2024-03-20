package CodeSignal;

import java.util.Scanner;

public class checkPalindrome_Prob03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
	public static boolean solution(String str) {
		for(int i = 0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}
