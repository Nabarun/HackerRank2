import java.util.*;
public class LongestCommonSubsequence {

	public static int[][] createMatrix(int arr1length, int arr2length){
		int[][] matrix = new int[arr1length][arr2length];
		for(int i = 0; i< arr1length; i++){
			for(int j = 0; j< arr2length; j++){
				matrix[i][j] = 0;
			}
		}
		return matrix;
	}
	
	public static int[][] createLcs(int[][] matrix, int[] arr1, int[] arr2){
		for(int i = 0; i< arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i]==arr2[j]){
					if(i==0){
						matrix[i][j]=1;
					}
					else{
						if(j==0 || i==0){
							matrix[i][j] = 1;
						}
						else{
							matrix[i][j] = matrix[i-1][j-1] +1;
						}
					}
				}
				else{
					if(i==0 && j==0){
						matrix[i][j]=0;
					}
					else if(i==0){
						matrix[i][j]= matrix[i][j-1];
					}
					else if(j==0){
						matrix[i][j] = matrix[i-1][j];
					}
					else{
						matrix[i][j]= Math.max(matrix[i-1][j], matrix[i][j-1]);
					}
				}
			}
		}
		return matrix;
	}
	
	public static int[] longestCommonString(int[][] matrix){
		
		int row = matrix.length-1;
		int col = matrix[0].length-1;
		int size = matrix[row][col];
		int[] lcsPath = new int[size];
		int count = 0;
		boolean isFound = false;
		while((matrix[row][col] != 0) && (row!=0 && col!=0)){
			isFound = false;
			if(matrix[row-1][col] == size){
				row=row-1;
				isFound = true;
			}
			else if(matrix[row][col-1] == size && !isFound){
				col =col-1;				
			}
			else if(matrix[row-1][col-1] == (size - 1)){
				lcsPath[count] = matrix[row][col];
				row = row -1;
				col = col -1;
				size  = matrix[row][col];
				count ++;
			}
		}
		lcsPath[count] = matrix[row][col];
		return lcsPath;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int firstArrayLength = s.nextInt();
		int secondArrayLength = s.nextInt();
		if(firstArrayLength<1 ||firstArrayLength>100){
			return;
		}
		if(secondArrayLength<1 ||secondArrayLength>100){
			return;
		}
		
		int[] arr1= new int[firstArrayLength];
		int[] arr2 = new int[secondArrayLength];
		for(int i=0; i< firstArrayLength; i++){
			arr1[i] = s.nextInt();
			if(arr1[i] <0 || arr1[i]>=1000){
				return;
			}
		}
		for(int i=0; i< secondArrayLength; i++){
			arr2[i] = s.nextInt();
			if(arr2[i] <0 || arr2[i]>=1000){
				return;
			}
		}
		
		int[][] matrix = createMatrix(arr1.length, arr2.length);
		int[][] lcsMatrix = createLcs(matrix, arr1, arr2);
		int[] lcsPath = longestCommonString(lcsMatrix);
		for(int i =lcsPath.length-1; i>= 0; i--){
			System.out.print(lcsPath[i]+" ");
		}
		
	}
	
}

