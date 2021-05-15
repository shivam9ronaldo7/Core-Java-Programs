package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
-----
Task 
-----
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

---------------
Sample Input 1
---------------
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

----------------
Sample Output 1
----------------
19

------------
Explanation
------------
A contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum(19) is:

2 4 4
  2
1 2 4

*/

public class Day11 {	
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        
        int row = arr[0].length;
        int column = arr[1].length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int a=0;a<=(row-3);++a) {
        	for(int b=0;b<=(column-3);++b) {
        		sum = arr[a][b]  +  arr[a][b+1]   + arr[a][b+2] +
        						    arr[a+1][b+1] + 
        			  arr[a+2][b] + arr[a+2][b+1] + arr[a+2][b+2];
        		max = Math.max(max, sum);
            	sum = 0;
        	}
        }
        System.out.println(max);
    }
}
