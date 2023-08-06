package strings;

import java.util.Scanner;

public class valid_anagram {
	public static void main(String args[]) {
		try(Scanner ip=new Scanner(System.in)){
		String s=ip.nextLine();
		String t=ip.nextLine();
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			arr[ch-'a']--;
		}
		for(int i=0;i<t.length();i++) {
			char ch=t.charAt(i);
			arr[ch-'a']++;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				System.out.println("false");
				return;
			}				
		}
		System.out.println("true");
		ip.close();
		}
	}
}
