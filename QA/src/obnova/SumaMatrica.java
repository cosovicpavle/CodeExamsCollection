package obnova;

public class SumaMatrica {

	public static void main(String[] args) {
		int rows=2;
		int columns = 3;

		int[][]firstMatrix= {{2,3,4},{5,2,3}};
	    int[][]secondMatrix= {{-4,5,3},{5,6,3}};
	    
	    int [][]sum=new int [rows][columns];
	    
	    for (int i = 0; i < rows; i++) {
	    	for (int j = 0; j < columns; j++) {
	    		sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
				
			}
			
		}
	    System.out.println("suma Matrica");
	    ispisMatrice(sum, rows, columns);

	}
	public static void ispisMatrice (int [][]sum, int rows,int columns) {
		System.out.print("SumMatrix= {");
		for (int i = 0; i<rows; i++) {
			System.out.print("{");
			for (int j = 0; j < columns; j++) {
				String nastavak = j!=columns-1 ? "," : "";
				System.out.print(sum[i][j]+nastavak);
				
				
			}
			String nastavak2=i!=rows-1 ? "}," : "}";
			System.out.print(nastavak2);
			
		
	}
		System.out.println("}");

}
}