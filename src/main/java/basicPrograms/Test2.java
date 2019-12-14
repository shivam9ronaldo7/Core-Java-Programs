package basicPrograms;

public class Test2 {
	
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	
	private static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}
	
	public static void rearrangeWord(String word) {
		permutations(word.toCharArray(), 0);
	}
	public static void main(String[] args) {
		//System.out.println("Result = "+rearrangeWord("baca"));
		rearrangeWord("baca");
	}

}
