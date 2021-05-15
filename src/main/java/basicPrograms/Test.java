package basicPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {	
	
	public static void main(final String[] args) {
	    //System.out.println(test());
		Map<String, String> abc = new HashMap<>();
		abc.put("a", "A");
		String str = abc.put("c", "B");
		//System.out.println(abc.put("a", "A"));
		//System.out.println(abc.put("a", "B"));
		//System.out.println(abc.put("a", "C"));
		System.out.println(str);
	}

	public static int test() {
	    int i = 0;
	    try {
	        i = 2;
	        return i;
	    } finally {
	        i = 12;
	        System.out.println("finally"+i);
	    }
	}

	public static void printReverFibonacci() {
		//Write a program to print Fibonacci series in reverse order without using Array and collection
		//normal fibo : 0 1 1 2 3 5 8 13
		//output : 13 8 5 3 2 1 1 0

		int limit = 10;
		int secondLast = 0;
		int last = 1;
		int countTemp = last+secondLast;
		String temp = " "+countTemp+" 1 0";
		for(int i=4; i<=limit;++i) {
			secondLast = last;
			last = countTemp;
			countTemp = last+secondLast;
			temp = " "+countTemp+temp;
		}
		System.out.println("O/P:"+temp);
	}

	public static void printOutput1() {
		//i/p: A$BCD%EF
		//o/p: F$EDC%BA

		String test = "ABC$%DEF";
		int dollarPos = test.indexOf("$");
		int perPos = test.indexOf("%");		

		String[] arr1=test.split("\\$");
		String[] arr2=arr1[1].split("\\%");
		String s=arr1[0]+arr2[0]+arr2[1];
		StringBuffer buff = new StringBuffer(s);
		buff.reverse();
		String rev = buff.toString();
		String str1=rev.substring(0, dollarPos)+"$";
		String str2=rev.substring(dollarPos, perPos-1);
		String str3="%"+rev.substring(perPos-1, rev.length());
		String revStr=str1+str2+str3;
		System.out.println(revStr);
	}
	
	public static void printOutput2() {
		String a = "I will eat 2 burgers 23 fries & 1.25 cokes l8r";
		a = a.replaceAll("[^0-9]+", " ").trim();
		String[] arr = a.split(" ");
		System.out.println(arr.length);
	}

	public static void leftEvenRightOdd() {
		//Move odd numbers to left even number to right
		int[] arr = {3,5,1,8,46,33,5,7,9};
		int left = 0;
		int right = arr.length-1;
		int temp = 0;
		while(left<right){
			while(((arr[left]%2)==1)&&(left<right)) {
				++left;
			}
			while(((arr[right]%2)==0)&&(left<right)) {
				--right;
			}
			if(left<right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void threadTest() {
		int length =100;
		Runnable oddPrint = ()->{
			System.out.println("Strating odd thread");
			for(int i = 1; i<=length; i=i+2) {
				System.out.println("Odd Thread: "+i);
			}
		};
		Runnable evenPrint = ()->{
			System.out.println("Strating even thread");
			for(int i = 2; i<=length; i=i+2) {
				System.out.println("Even Thread: "+i);
			}
		};
		new Thread(oddPrint).start();
		new Thread(evenPrint).start();
	}
	
	public static void alternatePrimeNumber() {
		int a = 20;
		int altCount = 0;
		for(int i=1; i<=a; ++i) {
			int divCounter =0;
			for(int j =i; j>=1; --j) {
				if(i%j==0) {
					++divCounter;
				}
			}
			if(divCounter==2) {
				if((altCount%2==0)) {
					System.out.println("Alt Prime number: "+i);					
				}
				++altCount;
			}
		}
	}

}
