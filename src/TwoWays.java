import java.util.*;
public class TwoWays {
	
	static int sum;
	public static int IncludePath(int[][] arr, int row, int col){
		if(row== arr.length-1 && col == arr.length-1){
			sum = arr[row][col];
			return sum;
		}	
		else if(col>=arr.length-1){
			IncludePath(arr, row+1, col);
		}
		else if( row >=arr.length-1){
			IncludePath(arr, row, col+1);
		}
		else if(arr[row][col+1]>arr[row+1][col]){
			IncludePath(arr, row+1, col);
		}
		else if(arr[row][col+1]<arr[row+1][col]){
			IncludePath(arr, row, col+1);
		}
		sum = sum + arr[row][col];
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int matrixSize = s.nextInt();
		int[][] arr = new int[matrixSize][matrixSize];
		for(int i = 0; i< matrixSize; i++){
			for(int j=0; j<matrixSize; j++){
				arr[i][j] = s.nextInt();
			}
		}
		int sum = IncludePath(arr, 0, 0);
		sum = sum + arr[arr.length-1][arr.length-1];
		System.out.println(sum);
	}

}
