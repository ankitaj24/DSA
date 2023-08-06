package number;

public class pattern {
	public static void main(String args[]) {
		int n=7;
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=2*i;j>1;j--)
				System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=2*(n-i);j>=0;j--)
				System.out.print("*");
			System.out.println();
		}
	}
}
/*
for(int i=1;i<=n;i++) {
for(int j=1;j<=i;j++) {
	System.out.print("*");
}
for(int k=2*(n-i);k>=1;k--) {
	System.out.print(" ");
}
for(int j=1;j<=i;j++) {
	System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=n;i++) {
for(int j=n;j>=i;j--) {
	System.out.print("*");
}
for(int k=2*(i-1);k>=1;k--) {
	System.out.print(" ");
}

for(int j=n;j>=i;j--) {
	System.out.print("*");
}
System.out.println();
}
*/