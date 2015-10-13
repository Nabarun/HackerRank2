import java.util.ArrayList;
import java.util.Collections;
public class CombSort {
	public static ArrayList<Integer> sortArray(ArrayList<Integer> arr){
		double shrinkFactor = 1.3;
		if(arr.size() >0){
			double gap = (arr.size()-1)/ shrinkFactor;
			
			while(gap>1){
				int i = 0;
				int j = (int) (i+ Math.floor(gap));
				while(j != arr.size()){
					if(arr.get(i)> arr.get(j)){
						arr.set(i, arr.get(i) ^ arr.get(j));
						arr.set(j, arr.get(j) ^ arr.get(i));
						arr.set(i,arr.get(i) ^ arr.get(j));
						
					}
					i++;
					j++;
				}
				gap =gap/ shrinkFactor;
			}
		}
		return arr;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<100; i++){
			arr.add(i);
		}
		Collections.shuffle(arr);
		System.out.println("Before Shuffle");
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.println("After Shuffle");
		arr = sortArray(arr);
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}


