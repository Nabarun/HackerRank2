//Using Longest Increasing subsequence and sorting the array effectively
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class EffectiveSort {
	public static int[] GetLIS(ArrayList<Integer> arr){
		int[] tempArr = new int[arr.size()];
		int[] backTrack = new int[arr.size()];
		for(int i =0; i< arr.size(); i++){
			int j =0;
			while(j<i){
				if(arr.get(i)> arr.get(j)){
					tempArr[i] = Math.max(tempArr[i], tempArr[j]+1);
				}
				j++;
			}
		}
		
		return tempArr;
	}
	
	public static void main(String[] args){
		int count =0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i< 50; i++){
			arr.add(i);
			count++;
		}
		Collections.shuffle(arr);
		
		for(int i:arr){
			System.out.print(arr.get(i)+" ");
		}
		int[] tempArr = GetLIS(arr);
		int[] backTrack = new int[arr.size()];
		int max = 0;
		count = 0;
		for(int i=0; i< tempArr.length; i++){
			if(max < tempArr[i]){
				backTrack[count] = arr.get(i);
				max = tempArr[i];
				count++;
			}
		}
		System.out.println();
		for(int i:tempArr){
			System.out.print(i+ " ");
		}
		System.out.println();
		for(int i: backTrack){
			System.out.print(i+" ");
		}
	}
}
