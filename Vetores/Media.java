import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n = 10;
		int i, a[];
		double media=0;
		
		a = new int [n];
		
		for (i=0; i<n; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de A:");
			a[i] = in.nextInt();
			media = media + a[i];
			
		}
		
		media = media/n;
		System.out.print("A média dos elementos do vetor A é de " + media);
		
		
	}
}
