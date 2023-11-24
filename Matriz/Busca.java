import java.util.Random;
public class Busca {
	public static void main(String[] args) {
		int busca[][] = new int [3][3];
		int i,j, maior = 0, menor = 100, iMaior=0, jMaior=0, iMenor=0, jMenor=0;
		
		Random in = new Random();
		
		for(i=0; i<3; i++){
			for(j=0; j<3; j++) {
				
				busca[i][j] = in.nextInt()%100;
			}
		}
		
		for(i=0; i<3; i++){
			System.out.print("[ ");
			for(j=0; j<3; j++) {
				System.out.print(busca[i][j] + " ");
				
			}
			System.out.print("]\n");
		}
		
		for(i=0; i<3; i++){
			for(j=0; j<3; j++) {
			
				if (busca[i][j]> maior) {
					maior = busca[i][j];
					iMaior = i+1;
					jMaior = j+1;
				}
				
				if (busca[i][j]< menor) {
					menor = busca[i][j];
					iMenor = i+1;
					jMenor = j+1;
				}
				
			}
		}
		
		System.out.println("O maior número é " + maior + ", localizado na linha " + iMaior + " e na coluna " + jMaior);
		System.out.println("O menor número é " + menor + ", localizado na linha " + iMenor + " e na coluna " + jMenor);
		
	}
}
