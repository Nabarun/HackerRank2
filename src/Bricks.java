import java.io.*;
import java.util.*;

public class Bricks {
    
    public static int getPermutation(int numberOfWays){
        ArrayList<Integer> perms = permsPresent(numberOfWays);
        Integer[] xCol = perms.toArray(new Integer[perms.size()]);
        int[][] matrix = new int[xCol.length][numberOfWays];
        for(int i = 0; i<xCol.length; i++){
            for(int j=0; j<numberOfWays;j++){
                if(i==0 || j==0){
                    matrix[i][j]=1;
                }
                else if(j%xCol[i]==0){
                    matrix[i][j]= Math.max(matrix[i-1][j], matrix[i][j-1]) +1;
                }
                else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[xCol.length-1][numberOfWays-1];
    }

    public static ArrayList<Integer> permsPresent(int num){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if(num==1){
        	primes.add(1);
        }
        for(int i=2; i<=num;i++){
            for(int j = 1; j<Math.sqrt(num); j++){
                if(i%j==0){
                    primes.add(i);
                    break;
                }
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfTest = s.nextInt();
        for(int i=0; i<numberOfTest; i++){
            int numberOfWays = getPermutation(s.nextInt());
            ArrayList<Integer> perms= permsPresent(numberOfWays);
            System.out.println(perms.size()-1);
        }
    }
}