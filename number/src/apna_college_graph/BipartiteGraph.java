package apna_college_graph;
import java.util.*;

public class BipartiteGraph {	
	public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        if(V==0||V==1)
        return true;
        
        int color[]=new int[V];
        boolean visited[]=new boolean[V];
        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                if(!check(i,adj,V,color,visited))
                return false;
            }
        }
        return true;
    }
    public static boolean check(int start,ArrayList<ArrayList<Integer>>adj,int V,int color[],boolean visited[]){
        
        Queue<Integer> q=new LinkedList<>();
		q.add(start);
		color[start]=-1;
		while(!q.isEmpty()) {
			int curr=q.remove();
			if(!visited[curr]) {
				visited[curr]=true;
				for(int i=0;i<adj.get(curr).size();i++) {					
					int dest=adj.get(curr).get(i);
					
					if(color[curr]==color[dest])
						return false;
					if(color[dest]==0){
					    color[dest]=(-1*color[curr]);
					}
					else if(color[curr]==-1)
						color[dest]=1;
					else if(color[curr]==1)
						color[dest]=-1;
					q.add(dest);
				}
			}
		}
		return true;
    }
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int V,e;
		System.out.println("Enter v and e");
		V=ip.nextInt();
		e=ip.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<Integer>());			
		}
		for(int i=0;i<e;i++) {
			int u=ip.nextInt();
			int v=ip.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		System.out.println(isBipartite(V,adj));
		ip.close();
	}
}
