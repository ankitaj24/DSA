package apna_college_graph;

public class disjoint_union_set_ds {
	static int n=7;
	static int par[]=new int[n];
	static int rank[]=new int[n];
	public static void init() {
		for(int i=0;i<par.length;i++) {
			par[i]=i;
		}
	}
	public static int find(int a) {//finding the parent of a
		if(par[a]==a)
			return par[a];
		return par[a]=find(par[a]);
	}
	public static void union(int a,int b) {//joining of a & b
		int parA=find(a);
		int parB=find(b);
		if(rank[parA]==rank[parB]) {
			par[parB]=parA;
			rank[parA]++;
		}
		else if(rank[parA]>rank[parB]) {
			par[parB]=parA;
		}
		else {
			par[parA]=parB;
		}
	}
	public static void main(String args[]) {
		init();
		System.out.println(find(3));
		union(1,3);
		System.out.println(find(3));
		union(3,2);
		System.out.println(find(2));
		union(5,6);
		System.out.println(find(6));
		union(6,4);
		System.out.println(find(4));
		union(4,3);
		System.out.println(find(3));
	}
}
