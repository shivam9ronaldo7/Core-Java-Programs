package basicPrograms;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*Marker annotation
 *Multi value annotation
 *For custom annotations @Target and @Retention annotations are used
 */
@Inherited//This will make this classes inherited class also to use this annotation
@Documented//This will will keep the document of the annotation
@Target(ElementType.TYPE)//This tells where this annotation can be used i.e. fields, class, methods and interfaces
@Retention(RetentionPolicy.RUNTIME)//This tells till what point this annotation will work
@interface SmartPhone{
	String os() default "Android";//Default value initialized. Value can be changed also
	int version();//Default value not initialized i.e. we have to provide or it will give error
}

@SmartPhone(os="iOS",version=7)
class Nokia{
	String model;
	int size;

	public Nokia(String model, int size) {
		this.model=model;
		this.size=size;
	}

}

public class CustomAnnotations {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Nokia obj = new Nokia("7 plus", 10);

		//Retrieving annotation values
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(Nokia.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
	}

}
