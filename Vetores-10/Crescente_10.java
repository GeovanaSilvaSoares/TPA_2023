import java.util.Scanner;
public class Crescente_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i, j, trocaValores;
		final int n=10;
		
		a = new int [n];
		b = new int [n];
		
		for (i=0;i<n;i++) {
			System.out.println("Entre com os valores do vetor A:");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if (a[i] < a[j]) {
					trocaValores = a[i];
					a[i] = a[j];
					a[j] = trocaValores;
				}
			}
		}
		
		for (i=0;i<n;i++) {
			b[i] = a[i];
		}
		
		System.out.print("Valores de A em ordem crescente: [");
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

