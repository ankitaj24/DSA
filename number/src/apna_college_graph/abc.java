package apna_college_graph;
import java.util.*;
public class abc {
	static class Pair implements Comparable<Pair>{
	    int v;
	    int wt;
	    Pair(int v,int wt){
	        this.v=v;
	        this.wt=wt;
	    }
	    public int compareTo(Pair that){
	        return this.wt-that.wt;
	    }
	}
	public static void main(String args[]) {
		int v=3;
		int edges[][]=new int[3][3];
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				edges[i][j]=ip.nextInt();
			}
		}
		
		
		ArrayList<ArrayList<Pair>> a=new ArrayList<ArrayList<Pair>>();
	    
	    for(int i=0;i<v;i++){
	        a.add(i,new ArrayList<>());
	    }
	    
	    for (int j = 0; j < edges.length; j++) {
	        a.get(edges[j][0]).add(new Pair(edges[j][1], edges[j][2]));
	        a.get(edges[j][1]).add(new Pair(edges[j][0], edges[j][2]));
	    }
	    for(int i=0;i<a.size();i++) {
	    	for(int j=0;j<a.get(i).size();j++) {
	    		System.out.println(i+" "+a.get(i).get(j).v+" "+a.get(i).get(j).wt);
	    	}
	    	System.out.println();
	    }
	    ip.close();
	}
}
