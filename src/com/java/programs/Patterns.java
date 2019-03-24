package com.java.programs;

public class Patterns {

	public static void main(String[] args) {

		pattern9(5);

	}

	//Method for Pattern 1
	public static void pattern1(int count) {
		//This method will print the below pattern
		//1 
		//1 2 
		//1 2 3 
		//1 2 3 4 
		//1 2 3 4 5

		System.out.println("Paattern 1:");
		for (int i=1;i<=count;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}

	//Method for Pattern 2
	public static void pattern2(int count) {
		//1 
		//2 2 
		//3 3 3 
		//4 4 4 4 
		//5 5 5 5 5

		System.out.println("Pattern 2:");
		for(int i=1;i<=count;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(i+" ");
			}
			System.out.println();
		}		
	}

	//Method for Pattern 3
	public static void pattern3(int count) {
		//1 
		//1 2 
		//1 2 3 
		//1 2 3 4 
		//1 2 3 4 5 
		//1 2 3 4 
		//1 2 3 
		//1 2 
		//1

		System.out.println("Pattern 3:");
		for(int i=1;i<=count;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=count-1;i!=0;--i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}				
	}

	//Method for Pattern 4
	public static void pattern4(int count) {
		//1 2 3 4 5 
		//1 2 3 4 
		//1 2 3 
		//1 2 
		//1 
		//1 
		//1 2 
		//1 2 3 
		//1 2 3 4 
		//1 2 3 4 5

		System.out.println("Pattern 4:");
		for(int i=count;i!=0;--i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=count;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}

	//Method for Pattern 5
	public static void pattern5(int count) {
		//5 4 3 2 1 
		//4 3 2 1 
		//3 2 1 
		//2 1 
		//1 
		//1 
		//2 1 
		//3 2 1 
		//4 3 2 1 
		//5 4 3 2 1

		System.out.println("Pattern 5:");
		for(int i=count;i!=0;--i) {
			for(int j=i;j!=0;--j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=count;++i) {
			for(int j=i;j!=0;--j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}

	//Method for Pattern 6
	public static void pattern6(int count) {
		//    1 
		//   1 2 
		//  1 2 3 
		// 1 2 3 4 
		//1 2 3 4 5 

		System.out.println("Pattern 6:");
		for(int i=1;i<=count;++i) {
			for(int j=1;j<=count-i;++j) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;++k) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	//Method for Pattern 7
	public static void pattern7(int count) {
		//5 4 3 2 1 
		//5 4 3 2 
		//5 4 3 
		//5 4 
		//5

		for(int i=count;i>0;--i) {
			for(int j=i;j>0;--j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

	//Method for Pattern 8
	public static void pattern8(int count) {
		//5 
		//5 4 
		//5 4 3 
		//5 4 3 2 
		//5 4 3 2 1

		for(int i=count;i>0;--i) {
			for(int j=count;j>=i;--j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	//Method for Pattern 9
	public static void pattern9(int count) {
		//1 2 3 4 5 
		//1 2 3 4 
		//1 2 3 
		//1 2 
		//1

		for(int i=count;i>0;--i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
	

}


