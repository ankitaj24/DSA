package stacks_queue;
import java.util.*;
public class celebrity_problem {
	static int celebrity(int M[][], int n)
    {
    	Stack<Integer> s=new Stack<>();
    	for(int i=0;i<n;i++){
    	    s.push(i);
    	}
    	while(s.size()>1){
    	    int j=s.pop();
    	    int i=s.pop();
    	    if(M[i][j]==0){
    	        s.push(i);
    	    }
    	    else{
    	        s.push(j);
    	    }
    	}
    	int pot=s.pop();
    	for(int i=0;i<n;i++){
    	    if(M[pot][i]==1){
    	        return -1;
    	    }
    	    if(M[i][pot]==0&&i!=pot){
    	        return -1;
    	    }
    	}
    	return pot;
    }
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int M[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				M[i][j]=ip.nextInt();
			}
		}
		System.out.println(celebrity(M,n));
		ip.close();
	}
}
