
class Array2D
{
	public static void main(String args[])
	{
		int matrix[][] = new int[3][3];
		int k = 0;
		
		//Read matrix from command line
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				matrix[i][j] = Integer.parseInt(args[k]);
				k++;
			}
		}

		//Transpose matrix
		int tmatrix[][] = new int[3][3];
		k=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				tmatrix[i][j] = matrix[j][i];
		}

		//Print Transpose matrix
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				System.out.print(tmatrix[i][j]+" ");
			System.out.println("");
		}
	}
}