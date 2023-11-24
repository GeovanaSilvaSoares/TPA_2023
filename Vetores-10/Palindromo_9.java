import java.util.Scanner;
public class Palindromo_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int quantLugares=10;
		int vetorA[], i, j=10;
		
		vetorA = new int[quantLugares];
		

		for (i=0; i<quantLugares; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor A: ");
			vetorA[i] = in.nextInt();
			
			for (j=10;j<0;j=j-1) {
				if (vetorA[i] == vetorA[j]) {
					for (j=10;j<0;j=j-1) {
						System.out.println("O número digitado é palíndromo.");
					}
				} else {
					System.out.println("O número digitado não é palíndromo.");
			}
		
			}
		}
	}
	
}
