import java.util.Scanner;
public class Tabuada_2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int n=5;
		int a[], i, j, t;
		
		a = new int [n];
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o "+(i+1)+"° do vetor A: ");
			a[i] = in.nextInt();
			
		}
		
		for (i=0; i<n; i++){
			System.out.println("Tabuada do " + (i+1) +"° valor do vetor A: ");
			for (j=0;j<11; j++) {
				t = a[i] * j;
				System.out.println(a[i]+" x "+ j + " = " + t);

			}
			System.out.println();
		}
	}

}
