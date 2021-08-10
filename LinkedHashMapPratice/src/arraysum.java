import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner
		int oldsum = 0;
        Scanner scanner = new Scanner(System.in);
        int arraysize = scanner.nextInt();                 // Reading input from STDIN
        System.out.println(arraysize);  
        List<Integer> list = new ArrayList<Integer>();
        for (int k = 0; k < arraysize; k++) {
				list.add(scanner.nextInt());
		}
		int[] array = list.stream().mapToInt(k -> k).toArray();
        for (int j = 0; j < array.length; j++) {
				oldsum = oldsum + array[j];
		}
        int numb = 0,newsum;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
        	numb = array[i];
        	newsum = 0;
        	for(int g = 0;g < array.length; g++) {
        		newsum = newsum + numb;
        	}
        	if(newsum > oldsum) {
    			break;
    		}
        }
        
        System.out.println(numb);
        
        
        
	}

}
