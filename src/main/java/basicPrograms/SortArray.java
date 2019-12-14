package basicPrograms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		//Array with data
		int a[] = new int[] {5,6,7,4,2,3,1,9,0,8};
		
		int arrLength = a.length;
		
		//Logic to sort array
		for(int i=0; i<arrLength; ++i) {
			for(int j=i; j<arrLength;++j) {
				int temp;
				if(a[j]<a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
