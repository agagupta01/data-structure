import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class socityProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt(); // Reading input from STDIN
		// System.out.println(testcase);
		List<String> result = new ArrayList<>();
		
		for (int i = 0; i < testcase; i++) {
			int numberOfHosue = scanner.nextInt();
			// System.out.println(numberOfHosue);

			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < numberOfHosue; j++) {
				list.add(scanner.nextInt());
			}
			int[] energyofplayers = list.stream().mapToInt(k -> k).toArray();

			result.add(maxValue(energyofplayers));
		}

		for(String ih : result) {
			System.out.println(ih);
		}
	}

	public static String maxValue(int[] a) {
		Arrays.sort(a);
		String result = "";
		int max = a[a.length - 1];
		//System.out.println(max);
		int temp = 0,maxindex = -1;
		for(int i =0;i < a.length-1;i++) {
			if(a[i]+1 != max && temp < a[i] + max) {
				temp = a[i] + max;
				maxindex = i;
			}
		}
		//System.out.println(a[maxindex]);
		if(temp < max) {
			result = String.valueOf(max);
		} else {
			result = String.valueOf(a[maxindex]).concat(String.valueOf(max));
			if(result.length() > 2) {
				result = String.valueOf(max);
			}
		}
		return result;
	}
}
