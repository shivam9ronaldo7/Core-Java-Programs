package com.java.programs;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDecimalPlaces {

	public static void main(String[] args) {
		
		ArrayList<String> numStrList = new ArrayList<String>();
		DecimalFormat df = new DecimalFormat("0.00");
		
		numStrList.add("1,00,000.000");
		numStrList.add("10,00,000.017");
		numStrList.add("5,00,000.002");
		
		List<String> numDobList = numStrList.stream().map(e->e.replaceAll(",", "")).
		map(e->df.format(Double.parseDouble(e))).collect(Collectors.toList());
		
		numStrList.stream().forEach(e->System.out.print(e+" "));
		System.out.println("\n");
		numDobList.stream().forEach(e->System.out.print(e+" "));
		
	}

}
