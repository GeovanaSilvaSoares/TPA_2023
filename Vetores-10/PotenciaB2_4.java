import java.util.Scanner;
public class PotenciaB2_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n=11;
		double a[], b[];
		int  i, base=2;
		
		a = new double [n]; 
		b = new double [n]; 
		
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor A: ");
			a[i] = in.nextInt();
		}
		
		
		for (i=0; i<n; i++) {
			b[i] = Math.pow(base, a[i]);
	
		}
		
		
		
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
