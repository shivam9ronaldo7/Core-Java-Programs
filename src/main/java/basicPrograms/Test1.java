package basicPrograms;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static int minX(List<Integer> arr) {
		int x;
		int runningSum = 0;
		int arraySize = arr.size();
		a:for(x=-100;x<=100;++x) {
			runningSum = x;
			System.out.println("X = "+x);
			b:for(int counter=0;counter<arraySize;++counter) {
				runningSum=runningSum+arr.get(counter);
				System.out.println("Running Sum = "+runningSum);
				System.out.println("Counter = "+counter);
				if(runningSum<1)
					break b;
				if((counter==arraySize-1)&&(runningSum>=1))
					break a;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println("Result = "+minX(Arrays.asList(new Integer[] {-5,4,-2,3,1,-1,-6,-1,0,-5})));
	}

}
