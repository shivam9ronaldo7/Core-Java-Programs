package basicPrograms;

public class Anagram {

	public static void main(String[] args) {	
		
		String givenString = "abc";
		String anagram = "";
		for(int i=givenString.length()-1; i>=0; --i) {
			anagram = anagram+Character.toString(givenString.charAt(i));
		}
		if(givenString.equals(anagram)) {
			System.out.println(givenString + " is anagram");
		} else {
			System.out.println(givenString + " is not anagram");			
		}
	}

}