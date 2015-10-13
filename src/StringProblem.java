import java.io.*;
import java.util.*;

public class StringProblem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String strA = s.nextLine();
        String strB = s.nextLine();
        char[] arrA = strA.toCharArray();
        char[] arrB = strB.toCharArray();
        int[][] matrix = new int[arrA.length][arrB.length];
        for(int i=0; i< arrA.length; i++){
            for(int j=0; j< arrB.length; j++){
                if(i==0 && arrA[i] != arrB[j]){
                	matrix[i][j]=0;
                }
                else if(j==0 && arrA[i] != arrB[j]){
                	matrix[i][j] = Math.max( 0, matrix[i-1][j]);
                }
                else if(arrA[i]==arrB[j]){
                	if(i==0 && j==0){
                		matrix[i][j] = 1;
                	}
                	else if(i==0){
                		matrix[i][j] = matrix[i][j-1]+1;
                	}
                	else if(j==0){
                		matrix[i][j] = matrix[i-1][j]+1;
                	}
                	else{
                		matrix[i][j]=matrix[i-1][j-1] + 1;
                	}
                }
                else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }                
            }            
        }
        
        System.out.println(matrix[arrA.length-1][arrB.length-1]);
    }
}