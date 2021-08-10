
/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int testcasenumber = scanner.nextInt();
		List<String> final1 = new ArrayList<String>();

		//System.out.println("testcasenumber: " + testcasenumber);
		
		for (int i = 0; i < testcasenumber; i++) {
			int result = 0;
			List<Integer> strengthsofVillainslist = new ArrayList<Integer>();
			List<Integer> energyofplayerslist = new ArrayList<Integer>();
			int numberofplayer = scanner.nextInt();
			//System.out.println("numberofplayer: " + numberofplayer);
			for (int j = 0; j < numberofplayer; j++) {
				// int[] array = list.stream().mapToInt(i->i).toArray();

				strengthsofVillainslist.add(scanner.nextInt());

			}
			int[] strengthsofVillains = strengthsofVillainslist.stream().mapToInt(k -> k).toArray();
			//for (int il : strengthsofVillains)
			//	System.out.println(il);
			for (int j = 0; j < numberofplayer; j++) {
				// int[] array = list.stream().mapToInt(i->i).toArray();

				energyofplayerslist.add(scanner.nextInt());

			}
			int[] energyofplayers = energyofplayerslist.stream().mapToInt(k -> k).toArray();
			//for (int il : energyofplayers)
			//	System.out.println(il);

			int max = 0;
			for (int g = 0; g < numberofplayer; g++) {
				max = helper(energyofplayers[g], strengthsofVillains);
				if (max != -1) {
					strengthsofVillains = removeElements(strengthsofVillains, max);
				} else {
					result = -1;
					break;
				}
			}

			if (result == 0) {
				final1.add("WIN");
			} else {
				final1.add("LOSE");
			}
			
		}
		for(String s : final1)
			System.out.println(s);
		scanner.close();
	}

	public static int helper(int energyofplayers, int[] strengthsofVillains) {
		int max = -1;
		boolean greater = false;
		Arrays.sort(strengthsofVillains);
		for (int p = strengthsofVillains.length - 1; p >= 0; p--) {
			max = strengthsofVillains[p];
			if (energyofplayers > max) {
				greater = true;
				return max;
			}
		}
		if(greater) {
			return max;
		} else {
			return -1;
		}
		
	}
	
	public static int[] removeElements(int[] input, int deleteMe) {
		int[] temp = new int [input.length - 1];
	    for(int i =0,j=0;i < input.length;i++) {
	        if(deleteMe != input[i]) {
	        	temp[j] = input[i];
	        	j++;
	        }
	    }

	    return temp;
	}

}
