import java.util.Scanner;
public class Soma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n = 10;
		int i, a[], b[], c[];
		
		a = new int [n];
		b = new int [n];
		c = new int [n];
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o " +(i+1)+ "° valor de A:");
			a[i] = in.nextInt();
		}
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o " +(i+1)+ "° valor de B:");
			b[i] = in.nextInt();
			c[i] = a[i] + b[i];
		}
		
		System.out.print("A soma dos valores são: [");
		for (i=0; i<n; i++) {
			for (i=0; i<n; i++) {
				if (i<(n-1)) {
					System.out.print(c[i] + " ,");
				}else {
					System.out.print(c[i]);
				}
			}
			System.out.print("]");
		}
	}
}
