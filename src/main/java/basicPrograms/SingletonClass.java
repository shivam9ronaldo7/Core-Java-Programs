package basicPrograms;

public class SingletonClass {

	public static void main(String[] args) {
		
		//Checking if calling the Singletons getObject method is creating only one object
		//or new object everytime
		System.out.println("1st time object created "+Singleton.getObject().hashCode());
		System.out.println("2nd time object created "+Singleton.getObject().hashCode());
		
	}
}

class Singleton{
	//Created an instance variable to store null value
	private static Singleton instanceVariable = null;
	
	//Marking constructor as private so that no one can create this class object
	//except using this class getObject method
	private Singleton(){
	}
	
	//Method to return object reference if object is created or not
	public static Singleton getObject() {
		if(instanceVariable==null) {
			instanceVariable = new Singleton();
		}
		return instanceVariable;
	}
}
