import java.util.Scanner;
public class Diferença_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n=10;
		int vetorA[], vetorB[], vetorC[], i,contLugares=0;
		
		
		vetorA = new int[n];
		vetorB = new int[n];
		vetorC = new int[n];
		
		for (i=0;i<n;i++) {
			System.out.println("Entre com o " + (i+1) + "° valor do vetor A:");
			vetorA[i] = in.nextInt();
			
		}
		
		for (i=0;i<n;i++) {
			System.out.println("Entre com o " + (i+1) + "° valor do vetor B:");
			vetorB[i] = in.nextInt();
			
		}
		

		for (i=0;i<n;i++) {
			if (vetorA[i] != vetorB[i]) { 
				
				vetorC[i] = vetorA[i];
				
			} 
		}

		
		System.out.print("Valores do vetor C: [");
		for (i=0; i<n; i++) {
			if (i == (n-1)) {
				System.out.print(vetorC[i]);
			} else {
				System.out.print(vetorC[i]+ ", ");
		 }		
			
		}
		System.out.print("]");
		
		System.out.println();
		System.out.println("OBS: os valores zerados são nulos, ou seja, o número de determinada posição é igual tanto no vetor A quanto no vetor B.");
	}
}
