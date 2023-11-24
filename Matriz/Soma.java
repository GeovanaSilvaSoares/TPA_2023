import java.util.*;
public class Soma {
	public static void main(String[] args) {
		int soma[][] = new int[3][4];
		int i, j;
		Scanner in = new Scanner(System.in);
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				
				System.out.println("Escreva o " + (j+1) + "° valor da " +(i+1)+ "° linha");
				soma[i][j] = in.nextInt();
				
			}
			
			soma[i][3] = soma[i][0] + soma[i][1] + soma[i][2];
			
		}

		
		for(i=0; i<3; i++){
			System.out.print("[ ");
			for(j=0; j<4; j++) {
				System.out.print(soma[i][j] + " ");
				
			}
			System.out.print("]\n");
		}
	
	}
}
