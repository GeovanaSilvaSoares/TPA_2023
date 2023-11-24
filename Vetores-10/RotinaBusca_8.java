import java.util.Scanner;
public class RotinaBusca_8 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			int i, a[], busca;
			final int n=10;
			
			a = new int [n];
			
			for (i=0; i<n; i++) {
				System.out.println("Entre com o "+(i+1)+"° valor do vetor A: ");
				a[i] = in.nextInt();
			}
			
			System.out.println("Insira o número inteiro que você busca:");
			busca = in.nextInt();
			
			for (i=0; i<n; i++) {
				if (busca == a[i]) {
					System.out.println("Valor encontrado com sucesso!");
					System.out.println("a["+ i + "] = " + a[i]);
					break;
				} 
			}
			 
			
			for (i=0; i<n; i++) {
				if (busca != a[i]) {
					System.out.println("Valor não encontrado no vetor A!");
					break;
				}
				
			}

		
	}
		
}
	
