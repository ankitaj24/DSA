package apna_college_bits_manipulation;

public class upper_to_lowercase {
	public static void main(String args[]) {
		for(char ch='A';ch<='Z';ch++)
			System.out.print(((char)(ch|' '))+" ");
	}
}
