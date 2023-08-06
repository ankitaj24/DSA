package arrays2d;
import java.util.*;
public class zig_zag_traversal {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		int n=ip.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		int x=1,y=0;
		ArrayList<Integer> a=new ArrayList<>();
		a.add(arr[0][0]);
		for(int i=1;i<n;i++) {
			a.add(arr[0][i]);
			x=1;
			y=i-1;
			while(x<=i&&y>=0) {
				a.add(arr[x][y]);
				x++;
				y--;
			}
		}
		for(int i=1;i<n;i++) {
			a.add(arr[i][n-1]);
			x=i+1;
			y=n-2;
			while(x<n&&y>0) {
				a.add(arr[x][y]);
				x++;
				y--;				
			}
		}
		System.out.println(a);
		ip.close();
	}
}
