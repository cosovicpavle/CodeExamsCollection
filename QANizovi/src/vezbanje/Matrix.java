package vezbanje;



public class Matrix {

	public static void main(String[] args) {
		int rows = 2, columns= 3;
		
		int[][]FirstMatrix = {{2,3,4},{5,2,3}};
		int[][]SecondMatrix = {{-4,5,3},{5,6,3}};
		
		int[][]sum=new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j]=FirstMatrix[i][j]+SecondMatrix[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
			
		}
			
		}
			
		
		
		

	}


