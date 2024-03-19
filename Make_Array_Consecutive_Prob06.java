// Problem Description
// Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

// For statues = [6, 2, 3, 8], the output should be 
// solution(statues) = 3

package CodeSignal;

import java.util.Arrays;
import java.util.Scanner;

public class Make_Array_Consecutive_Prob06 {

	public static void main(String[] args) {
		// input of the array 
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n = scn.nextInt();
		int[] statues = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i<n;i++) {
			statues[i]= scn.nextInt();
		}
		System.out.println("Elements required: " + makeArrayConsecutive(n, statues));
		
	}
	
	public static int makeArrayConsecutive(int n, int[] statues) {
		// n = max size
		// statues = input array
		Arrays.sort(statues); // sorting the array first
		int count = 0;
		for (int i = 0; i<n-1;i++) {
			if(statues[i+1] - statues[i] !=0) {
				count = count + (statues[i+1] - statues[i] - 1);
			}
		}
		return count;
	}

}
