import java.util.Scanner;
public class Quadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n = 10;
		int i, a[], b[];
		
		a = new int [n];
		b = new int [n];
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de A:");
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];
		}
		
		System.out.print("Os quadrados de A são: [");
		for (i=0; i<n; i++) {
			if (i<(n-1)) {
				System.out.print(b[i] + " ,");
			}else {
				System.out.print(b[i]);
			}
		}
		System.out.print("]");
	}
}
