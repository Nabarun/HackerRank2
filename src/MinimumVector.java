import java.util.Scanner;
public class MinimumVector {
	public static int getminimumScalarCombination(int[] arrayA, int[] arrayB){
		int[] helperA = new int[arrayA.length];
		int[] helperB = new int[arrayB.length];
		int[] mergeSortArrA = mergeSort(arrayA,helperA, 0, arrayA.length-1, true);
		int[] mergeSortArrB = mergeSort(arrayB,helperB, 0, arrayB.length-1, false);
		int i = 0,j=0;
		int mult=0;
		if(mergeSortArrA == null && mergeSortArrB==null){
			return -1;
		}
		
		while(i<mergeSortArrA.length && j< mergeSortArrB.length){
			mult = mult+arrayA[i]*arrayB[j];
			i++;
			j++;
		}
		return mult;
	}
	
	public static int[] mergeSort(int[] arr, int[]helper, int low, int high, boolean isAscending){		
		if(low >= high){
			return null;
		}
		else{
			int middle = (low+high)/2;
			mergeSort(arr, helper, low, middle, isAscending);
			mergeSort(arr, helper, middle+1, high,isAscending);
			int[] mergeArr = merge(arr,helper, low, middle, high, isAscending);
			return mergeArr;
		}
	}
	
	public static int[] merge(int[] array, int[] helper, int low, int middle, int high, boolean isAscending){
		for(int i=low; i<= high; i++){
			helper[i] = array[i];
		}
		int helperLeft = low;
		int helperRight = middle+1;
		int current =low;
		while(helperLeft <= middle && helperRight<= high){
			if(isAscending){
				if(helper[helperLeft]<= helper[helperRight]){
					array[current]= helper[helperLeft];
					helperLeft++;
				}
				else{
					array[current] = helper[helperRight];
					helperRight++;
				}
			}
			else{
				if(helper[helperLeft]>= helper[helperRight]){
					array[current]= helper[helperLeft];
					helperLeft++;
				}
				else{
					array[current] = helper[helperRight];
					helperRight++;
				}
			}
			current++;
		}
		int remaining = middle - helperLeft;
		for(int i =0; i<= remaining; i++){
			array[i + current]=helper[helperLeft + i];
		}
		return array;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int numberOfTestCase = s.nextInt();
		for(int i = 0; i< numberOfTestCase; i++){
			int numberOfElements = s.nextInt();
			int[] arrA = new int[numberOfElements];
			int[] arrB = new int[numberOfElements];
			for(int j =0; j< numberOfElements; j++){
				arrA[j]= s.nextInt();
			}
			for(int j =0; j<numberOfElements; j++){
				arrB[j] = s.nextInt();
			}
			int mult = getminimumScalarCombination(arrA, arrB);
			System.out.println("Case #"+(i+1)+": "+ mult);
		}
	}
}
