
public class Dobro {
	public static void main(String[] args) {
		int dobro[][] = new int [4][4];
		int i, j, valor = 2;
		
		
		
		for(i=0; i<4; i++){
			for(j=0; j<4; j++) {
		
				if(i==0 && j==0) {
					valor = 2;
					dobro[i][j] = valor;
				}
				else {
					dobro[i][j] = valor*2;
					valor *=2;
				}
				
							
			}
			
		}

		
		for(i=0; i<4; i++){
			System.out.print("[ ");
			for(j=0; j<4; j++) {
				System.out.print(dobro[i][j] + " ");
				
			}
			System.out.print("]\n");
		}
	}
}
