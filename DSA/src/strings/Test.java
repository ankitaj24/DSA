package strings;
import java.util.*;
public class Test {
	public static void main(String args[]) {
		try(Scanner ip=new Scanner(System.in)){
          //Scanner ip=new Scanner(System.in);
			System.out.println("Enter a string: ");
			String s=ip.nextLine();
			String[] ss = s.split(" ");
			StringTokenizer str=new StringTokenizer(s," ");
			HashMap<String,Integer> map=new HashMap<>();
			while(str.hasMoreTokens()) {			
				String word=str.nextToken();			
				map.put(word, map.getOrDefault(word, 0)+1);
			}
			int max=Integer.MIN_VALUE;
			String key="";
			for(String i: map.keySet()) {
				if(max<map.get(i)) {
					max=map.get(i);
					key=i;
				}
			}
			System.out.println(map);
			System.out.println(key+" "+max);
		}
		
	}
}
/*

*/
