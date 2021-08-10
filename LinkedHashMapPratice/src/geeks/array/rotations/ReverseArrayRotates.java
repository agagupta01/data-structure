package geeks.array.rotations;

public class ReverseArrayRotates {

public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		int d = 3;
		int temp;
		
		for(int a = 0 ; a < d ;a++) {
			int last = arr.length -1;
			temp = arr[last ];
			int i,j;
			for(i = last ,j= last - 1 ; i > 0   ;i--,j--) {
				arr[i] = arr[j];
			}
			arr[0] = temp;
		}
		
		
		for(int i = 0 ; i < arr.length;i++)
		System.out.println(arr[i]);
		
		
	}
}
