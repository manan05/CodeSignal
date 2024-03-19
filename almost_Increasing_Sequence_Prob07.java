package CodeSignal;

import java.util.Scanner;

public class almost_Increasing_Sequence_Prob07 {

	public static void main(String[] args) {
		// input of the array
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n = scn.nextInt();
		int[] sequence = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			sequence[i] = scn.nextInt();
		}
		
		System.out.println(solution(sequence));

	}
	
	public static boolean solution(int[] sequence) {
		int count  = 0;
		for(int i =0; i<sequence.length-1; i++) {
			if(sequence[i]>= sequence[i+1]) {
				count ++;
				if(count>1) {
					return false;
				}
				if(i>0 && sequence[i] >= sequence[i+1] && i<sequence.length -1 && sequence[i] >= sequence[i+2]) {
					return false;
				}
			}
		}
		return true;
	}

}
