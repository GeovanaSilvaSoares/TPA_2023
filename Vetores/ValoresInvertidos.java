import java.util.Scanner;
public class ValoresInvertidos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n = 10;
		int i, j, a[], b[];
		
		a = new int [n];
		b = new int [n];
		j = n-1;
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de A:");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
		}
		
		System.out.print("Os valores de A são: [");
		for (i=0; i<n; i++) {
			if (i == (n-1)) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i]+ ", ");
			}
		}
		System.out.print("]");
		System.out.println();
		
		
		System.out.print("Os valores de B são: [");
		for (i=0; i<n; i++) {
			if (i == (n-1)) {
				System.out.print(b[i]);
			} else {
				System.out.print(b[i]+ ", ");
			}
		}
		System.out.print("]");
	}
}
