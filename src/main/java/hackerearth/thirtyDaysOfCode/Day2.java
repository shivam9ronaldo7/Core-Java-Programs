package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
-----
Task 
-----
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price 
being added as tip), and tax percent (the percentage of the meal price being added as tax) 
for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an 
incorrectly rounded result!

-------------
Sample Input
-------------
12.00
20
8

--------------
Sample Output
--------------
15

------------
Explanation
------------
Given: 
mealCost = 12, tipPercent = 20, taxPercent = 8
Calculations:
tip = 12*(20/100) = 2.4
tax = 12*(8/100) = 0.96
totalCost = mealCost + tip + tax = 12 + 2.4 + 0.96 = 15.36
round(totalCost) = 15

We round totalCost to the nearest dollar (integer) and then print our result, 15.

*/

public class Day2 {
	private static final Scanner scanner = new Scanner(System.in);
	
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		Double tip = meal_cost*((double)tip_percent/100);
		Double tax = meal_cost*((double)tax_percent/100);
		Double totalCost = meal_cost + tip + tax;
		System.out.println(Math.round(totalCost));
    }
		
	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        solve(meal_cost, tip_percent, tax_percent);
        scanner.close();
	}

}
