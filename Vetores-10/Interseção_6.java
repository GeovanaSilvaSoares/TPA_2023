import java.util.Scanner;
public class Interseção_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n = 10;
		int a[], b[], c[], i;
		
		a = new int [n]; 
		b = new int [n]; 
		c = new int [20]; 
		
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor A: ");
			a[i] = in.nextInt();
			c[i] = a[i];
		}
		
		System.out.println();
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor B: ");
			b[i] = in.nextInt();
			c[n+i] = b[i];
		}
		
		
		System.out.print("Valores do vetor C: [");
		for (i=0; i<(2*n); i++) {
			if (i == ((2*n)-1)) {
				System.out.print(c[i]);
			} else {
				System.out.print(c[i]+ ", ");
		 }		
			
		}
		System.out.print("]");
		}
	}
