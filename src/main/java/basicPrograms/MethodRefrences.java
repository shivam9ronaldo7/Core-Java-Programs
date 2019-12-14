package basicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser{
	String parse(String str);
}

class StringParser{
	public static String convert(String str) {
		if(str.length()<=10)
			str=str.toUpperCase();
		else
			str=str.toLowerCase();

		return str;
	}
}

class MyPrinter{
	public void print(String str, Parser p) {		
		str=p.parse(str);
		System.out.println(str);
	}
}

public class MethodRefrences {

	public static void main(String args[]) {
		List<String> list = Arrays.asList("One","Two","Three","Four","Five");

		/*
		 * Consumer is a Functional Interface.
		 */
		Consumer<String> con1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}			
		};

		System.out.println("Anonymous Inner Class Concept");
		list.forEach(con1);

		/*
		 * Above implementation can be changed using Lambda Expression
		 * since Consumer is a Functional Interface.
		 */
		System.out.println("Lambda Expression Concept");
		list.forEach(s->System.out.println(s));

		/*
		 * Above implementation can be changed using Method References
		 * since we are just passing a value and printing it.
		 * In Method References we have a new concept called pass by method
		 * were we pass method as a higher order function just like in 
		 * JAVASCRIPT.
		 */
		System.out.println("Method References Concept");
		list.forEach(System.out::println);

		/*
		 * Real time example of Method References.
		 */
		String str = "Shivam Pratap Singh";
		MyPrinter mp = new MyPrinter();
		
		System.out.println("Real time example of Anonymous Inner Class Concept");
		mp.print(str, new Parser() {			
			@Override
			public String parse(String s) {
				return StringParser.convert(s);
			}
		});
		
		System.out.println("Real time example of Lambda Expression Concept");
		mp.print(str, (s->StringParser.convert(s)));
		
		System.out.println("Real time example of Method References Concept");
		mp.print(str, (StringParser::convert));
		
	}
}
