import java.util.*;
public class Increasing {
	public int getNewArraySize(int[] arr){
		int size = 0;	
		int sum =0;
		int initialSize = arr.length;
		int[] tempArr = new int[arr.length];
		for(int i =0;i< initialSize; i++){
			int initial = tempArr[i];
			for(int j =0; j<i; j++){				
				if(arr[j] < arr[i]){
					tempArr[i] = Math.max(tempArr[i], tempArr[j]+1);					
				}
				if(initial != tempArr[i]){
					sum = sum+arr[i];
				}
			}
			for(int j=0; j<initialSize; j++){
				System.out.print(tempArr[j]+" ");
			}
			System.out.println();
		}
		for(int i: tempArr){
			if(size < i){
				size = i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numberOfTests = s.nextInt();
		for(int i=0; i< numberOfTests; i++){
			int numberOfElements = s.nextInt();
			int[] arr = new int[numberOfElements];
			for(int j=0;j<numberOfElements; j++){
				
			}
		}
	}
}
