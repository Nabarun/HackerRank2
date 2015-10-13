import java.io.*;
import java.util.*;

public class IcecreamParlor {
	private static int foundPosition;
    public static boolean binarySearch(int[] arr, int start, int end, int num){
        if(start>end){
            return false;
        }
        if(start==end && num!=arr[start]){
        	return false;
        }
        int mid = (start+end)/2;
        if(arr[mid]==num){
        	foundPosition = mid;
            return true;
        }
        else{
            if(arr[mid]>num){
                binarySearch(arr, start, mid, num);
            }
            else{
                binarySearch(arr, mid+1, end, num);
            }
        }
        if(foundPosition !=0){
        	return true;
        }
        else{
        	return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numTestCase = s.nextInt();
        for(int i = 0; i< numTestCase; i++){
            int dollar = s.nextInt();
            int flavors = s.nextInt();
            int[] costs = new int[flavors];
            for(int j = 0; j < flavors; j++){
                costs[j] = s.nextInt();                
            }
            int[] sortedArray = costs.clone();
            Arrays.sort(sortedArray);
            foundPosition = 0;
            for(int j = 0; j<flavors; j++){
                int remaining = dollar - costs[j];
                if(remaining != 0){
                    if(binarySearch(sortedArray,0,flavors-1, remaining)){
                        for(int k=0;k<flavors; k++){
                        	if(costs[k]==remaining && j!=k){
                        		if(j<=k){
                        			System.out.println((j+1)+" "+(k+1));
                        		}
                        		else{
                        			System.out.println((k+1)+" "+(j+1));
                        		}
                        	}
                        }
                        break;
                    }
                }
            }
        }
    }
}