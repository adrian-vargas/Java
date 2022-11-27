
public class Arrays_bidimensionales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix={
				
				{15,21,18,9,15},{10,52,17,19,7},{19,2,19,17,7},{92,13,13,32,41}
				
		};
		/*
System.out.print("Los valores de la matriz son: \n ");
		
		for(int i=0;i<4;i++){
			
			System.out.println();
			
			for(int j=0;j<5;j++){
				
				System.out.println(" (" + i + "," + j + ")" + " = " + matrix[i][j]);
				
			}
			
		}
		*/
		
		for(int[]fila:matrix){
			
			System.out.println();
			
			for(int z:fila){
				
				System.out.print(z+" ");
				
			}
			
		}
		
	}

}
