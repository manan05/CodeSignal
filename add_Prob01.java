package CodeSignal;

import java.util.Scanner;

public class add_Prob01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int param1 = scn.nextInt();
		int param2 = scn.nextInt();
		System.out.println(solution(param1, param2));
	}
	public static int solution(int param1, int param2) {
		return param1 + param2;
	}

}
