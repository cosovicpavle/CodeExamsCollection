package nizovi;

public class ZbirDveMatrice {

	public static void main(String[] args) {
		
		int rows = 2;
		int columns=3;
		
		int [][]firstMatrix = {{2,3,4},{5,2,3}};
		int [][]secondMatrix = {{-4,5,3},{5,6,3}};
		
		int [][]sumMatrix =  new int [rows][columns];
		
		
		
		
		for(int i =0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sumMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
				
				
				
			}
		}
		
		ispisMatrice(sumMatrix, columns, rows);
		
		
	

	}
	
	public static void ispisMatrice(int[][]sumMatrix,int columns,int rows) {
		System.out.print("sumMatrix = {{");
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j <columns ; j++) {
				String nastavak = j!=columns-1 ? ",": "";
				System.out.print(sumMatrix[i][j]+nastavak);
				
			}
			String nastavak2= i!=rows-1 ? "},{": "}";
			System.out.print(nastavak2);
		
			
			
		}
		System.out.println("}");
		
		
		
		
	}

}
