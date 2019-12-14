package basicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
	
	public static String dnaComplement(String s) throws Exception {
		List<String> dnaStringList = Arrays.asList(new StringBuffer(s).reverse().toString().split(""));
		for(int a=0;a<dnaStringList.size();++a) {
			dnaStringList.set(a, dnaComplementString(dnaStringList.get(a)));
		}
		return dnaStringList.stream().map(String::valueOf).collect(Collectors.joining());
	}
	
	public static String dnaComplementString(String s) throws Exception {
		switch(s) {
		case "A": s = "T";
		break;
		case "T": s = "A";
		break;
		case "C": s = "G";
		break;
		case "G": s = "C";
		break;
		default: throw new Exception("Invalid Input");
		}
		return s;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Result = "+dnaComplement("ATCGTA"));
	}

}
