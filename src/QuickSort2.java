import java.util.Scanner;
public class QuickSort2 {
	public static int[] quickSort(int[]arr, int low, int high){
		int pos = partition(arr, low, high);
		if(pos == -1){			
			return null;
		}		
		
			
		quickSort(arr, low, pos);		
		quickSort(arr, pos+1, high);
		if(high-low > 1){
			for(int i=low; i<high; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		return arr;
	}
	public static int partition(int[]arr, int low, int high){
		if(high<=low){
			return -1;
		}
		int pivot = arr[low];
		int pos = low;
		int i = low+1;
		
		while(i<high){
			if(pivot>arr[i]){
				int temp = arr[i];
				int j = i;
				while(j-1>=low){
					arr[j] = arr[j-1];
					j--;
				}
				arr[low] = temp;
				low++;
				pos++;
			}
			i++;
		}
		
		return pos;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numberOfEntities = s.nextInt();
		int[] arr = new int[numberOfEntities];
		for(int i =0; i< numberOfEntities; i++){
			arr[i] = s.nextInt();
		}
		arr = quickSort(arr, 0 , arr.length);
		
	}
}
