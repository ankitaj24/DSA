package apna_college_greedy;


//lexicographically smallest string of length N and sum K
public class smallest_string {
	public static void cal(int n,int k) {
		//String str="";
		char ch[]=new char[n];
		for(int i=0;i<n;i++)
			ch[i]='a';
		for(int i=n-1;i>=0;i--) {
			k=k-i;
			//System.out.println(k);
			if(k>=0) {
				if(k>=26){
					ch[i]='z';
					k=k-26;
				}
				else {
					ch[i]=(char)(k+97-1);
					k=k-(ch[i]-'a'+1);
				}
			}
			else
				break;
			k=k+i;
			//System.out.println(k);
		}
		 System.out.println(ch);
	}
	public static void main(String args[]) {
		int n=3,k=25;
		cal(n,k);
	}
}
/*brute force
 * Integer arr[]=new Integer[26];
		int left=k,j=arr.length-1;
		for(int i=0;i<26;i++)
			arr[i]=i+1;
	    while(n>0) {
	    	if(arr[j]<left&&left-arr[j]>=n-1) { 
	    		while(arr[j]<=left&&left-arr[j]>=n-1) {
	    			//System.out.println(left+" "+j);	    		
		    		left=left-arr[j];
		    		str=(char)(j+'a')+str;
		    		n--;
	    		}	    		
	    	}
	    	j--;	    	
	    }
	    */
 

