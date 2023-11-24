import java.util.Random;
import java.util.*;

public class Bingo {
	public static void main(String[] args) {
		int bingo[][]= new int[4][4];
		int i, j, soma=0, nCantado, rodadas;
		
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);
		
		
		for(i=0; i<4; i++){
			for(j=0; j<4; j++) {
				
				bingo[i][j] = aleatorio.nextInt(75)+1;
				soma = soma + bingo[i][j];
			}
			
		}
		
		for(i=0; i<4; i++){
			System.out.print("[ ");
			for(j=0; j<4; j++) {
				System.out.print(bingo[i][j] + " ");
				
			}
			System.out.print("]\n");
		}
		
		
		for(rodadas=0; soma!= 0 ; rodadas++){
			
			System.out.println("Escreva o n�mero cantado:");
			nCantado = ler.nextInt();
			
			for(i=0; i<4; i++){
				

				for(j=0; j<4; j++) {
					
					if (nCantado==bingo[i][j]) {
						System.out.println("Parab�ns, voc� tem este n�mero!");
						soma = soma - bingo[i][j];
						bingo[i][j] = 0;
					}else {
						System.out.println("Que pena, voc� n�o tem este n�mero!");
					}
					
				}
			}
			

		}
		
		System.out.println("BINGO! Voc� demorou " + rodadas + " rodadas para vencer");
		
		
		
		
		
	}

}
