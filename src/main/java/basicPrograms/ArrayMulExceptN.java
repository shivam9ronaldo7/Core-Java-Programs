package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMulExceptN {

	public static void main(String[] args) {
		System.out.println("Enter the number for product");
		
		//Using scanner to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Array of multiple digits
		int[] arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		
		int arrLength = arr.length;
		
		System.out.println("Enter the positon of element to exumpted");
		
		System.out.println("From 1 to "+arrLength);
		
		int exElement = sc.nextInt()-1;
		
		//Logic not to enter wrong data
		if(!((exElement<arrLength) && (exElement>=0))) {
			System.out.println("Please enter correct data");
			System.exit(0);
		}
		
		sc.close();
		
		int product = 1;
		
		//Loop to calculate the product exumpting the specified element
		for(int a=0; a<arrLength;++a) {
			if(a!=exElement)
				product = product*arr[a];
		}
		
		System.out.println("Product of elements: "+product);

	}

}
