package geeks.array.rotations;

public class ArrayRotates {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		int d = 4;
		int temp;
		
		for(int a = 0 ; a < d ;a++) {
			temp = arr[0];
			int i,j;
			for(i = 0 ,j= i + 1 ; i < arr.length -1  ;i++,j++) {
				arr[i] = arr[j];
			}
			arr[j-1] = temp;
		}
		
		
		for(int i = 0 ; i < arr.length;i++)
		System.out.println(arr[i]);
		
		
	}
}
