package geeks.array.rotations;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {

		/*List<String> tmpList = new ArrayList<String>();
		tmpList.add("a");
		tmpList.add("b");
		tmpList.add("c");
		tmpList.add("c");
		tmpList.add("c");
		tmpList.add("d");
		tmpList.add("e");
		tmpList.add("e");*/
		
		List<String> tmpList = Arrays.asList("a","b","c","d","e","e","e","e","d","d","c","b","f","g","f"); 

		/*
		 * Iterator itr = tmpList.iterator(); while(itr.hasNext()) { itr.next();
		 * 
		 * }
		 * 
		 * String[] y = tmpList.toArray(new String[tmpList.size()]); int count = 0;
		 * for(int i = 0 ; i< y.length ;i++) { if(y[i].equals(y[i+1])){ count++;
		 * 
		 * } }
		 */

		List<String> newList = getMyShrunkArray(tmpList, 3);
		int oldListSize = tmpList.size();
		if(newList.size() < oldListSize) {
			oldListSize = newList.size();
			newList = getMyShrunkArray(newList, 3);
			
		}
		System.out.println(newList);

	}

	public static List<String> getMyShrunkArray(List<String> inputArray, int burstLength) {
		List<String> result = new ArrayList<String>();
		String[] y = inputArray.toArray(new String[inputArray.size()]);
		for (int i = 0; i < y.length; i++) {

			int count = 0, j;

			for (j = i + 1; j < y.length; j++) {
				if (y[i].equals(y[j])) {
					count++;
				} else {
					break;
				}

			}

			if (count >= burstLength - 1) {
				for (int e = j - 1; count + 1 > 0; e--, count--) {
					y = removeTheElement(y, e);
				}
			}
		}

		for (int i = 0; i < y.length; i++)
			result.add(y[i]);
		return result;

	}

	public static String[] removeTheElement(String[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}

		String[] anotherArray = new String[arr.length - 1];

		for (int i = 0, k = 0; i < arr.length; i++) {

			if (i == index) {
				continue;
			}

			anotherArray[k++] = arr[i];
		}

		return anotherArray;
	}

}
