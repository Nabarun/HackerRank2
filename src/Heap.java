import java.io.*;
import java.util.*;

public class Heap {
    static int maxHeapCount =0;
    static int minHeapCount = 0;
	public static int leftChild(int pos){
		return 2*pos+1;
	}
	
	public static int rightChild(int pos){
		return 2*pos+2;
	}
	
	public static int parent(int pos){
		return (int) Math.floor((double)pos/(double)2);
	}
	
	public static int[] minheap(int[] arr, int pos){
		if(!isLeaf(arr,pos,false)){
			if(arr[pos] > arr[leftChild(pos)] || arr[pos] > arr[rightChild(pos)]){
				if(arr[leftChild(pos)]< arr[rightChild(pos)]){
					arr = swap(arr, leftChild(pos), pos);
					minheap(arr, leftChild(pos));
				}
				else{
					arr = swap(arr, rightChild(pos), pos);
					minheap(arr, rightChild(pos));
				}
			}
		}
		return arr;
	}
	
	public static int[] maxheap(int[] arr, int pos){
		if(!isLeaf(arr,pos, true)){
			if(arr[pos] < arr[leftChild(pos)] || arr[pos] < arr[rightChild(pos)]){
				if(arr[leftChild(pos)]> arr[rightChild(pos)]){
					arr = swap(arr, leftChild(pos), pos);
					maxheap(arr, leftChild(pos));
				}
				else{
					arr = swap(arr, rightChild(pos), pos);
					maxheap(arr, rightChild(pos));
				}
			}
		}
		return arr;
	}
	
	public static boolean isLeaf(int[] arr,int pos, boolean isMaxHeap){
		int length=0;
		if(isMaxHeap){
			length = maxHeapCount;
		}
		else{
			length = minHeapCount;
		}
		if(pos >= length/2 && pos <=length){
			return true;
		}
		return false;
	}
	public static int[] swap(int[]arr, int a, int b){
		arr[a]=arr[a]^arr[b];
		arr[b]=arr[b]^arr[a];
		arr[a]=arr[a]^arr[b];
		return arr;
	}
	
	public static int[] minHeap(int[] array){
		for(int i = (minHeapCount/2); i>=0; i--){
			minheap(array, i);
		}
		return array;
	}
	public static int[] maxHeap(int[] array){
		for(int i = (maxHeapCount/2); i>=0; i--){
			array = maxheap(array, i);
		}
		return array;
	}
	
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int size = s.nextInt();
    	int[]arr = new int[size];
        int[] minHeap = new int[size/2];
        Arrays.fill(minHeap, Integer.MIN_VALUE);
        
        int[] maxHeap = new int[size/2];
        Arrays.fill(minHeap, Integer.MAX_VALUE);
        
        int actualSize = 0;
        for(int i = 0; i< size; i++){
        	arr[i] = s.nextInt();
        	
        	for(int j=0; j<=actualSize; j++){
        		if(j<=actualSize/2){
        			maxHeap[maxHeapCount++] = arr[j];
        		}
        		else{
        			minHeap[minHeapCount++]= arr[j];
        		}
        	} 
        	
        	int maxHeapNumber = maxHeap(maxHeap)[0];
            
            double median = 0;
        	if(actualSize%2 == 0){
        		median = maxHeapNumber;        		
        	}
        	else{
        		int minHeapNumber = minHeap(minHeap)[0];
        		median = (double)(maxHeapNumber+minHeapNumber)/(double)2;
        	}
        	
            System.out.println(median);
            actualSize++;
            maxHeapCount=0;
            minHeapCount=0;
        }
        
        
    }
}