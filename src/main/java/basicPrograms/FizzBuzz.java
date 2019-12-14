package basicPrograms;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		//Scanner class have methods to take values from console i.e
		//values given by the users from the console
		Scanner sc = new Scanner(System.in);
		
		int numberOfTC = sc.nextInt();
		
		//Closing the Scanner object
		sc.close();
		
		Integer[] arrayNumOfTC = new Integer[numberOfTC];
		
		//Loop to store the elements in an array
		for(int position = 0;position<numberOfTC;++position) {
			arrayNumOfTC[position] = sc.nextInt();
		}
		
		int number = 0;
		
		//Loop for number of iterations
		for(int i=0;i<numberOfTC;++i) {
			
			number = arrayNumOfTC[i];
			
			//Loop to print values from 1 to given integer
			for(int j=1;j<=number;++j) {
				
				if(((j%3)==0)&&((j%5)==0)) {
					System.out.println("FizzBuzz");
				}else if((j%3)==0) {
					System.out.println("Fizz");
				}else if((j%5)==0) {
					System.out.println("Buzz");
				}else {
					System.out.println(j);
				}
			}			
		}		
	}
}
