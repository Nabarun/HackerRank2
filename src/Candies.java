import java.util.Scanner;
public class Candies {
	public static long[] orderRating(int[] arr){
		long[] temp = new long[arr.length];
		for(int i=0;i< arr.length; i++){
			temp[i]=1;
		}
		for(int i = 0; i< arr.length-1; i++){
			if(arr[i]< arr[i+1]){
				temp[i+1] = temp[i] +1;
			}
			else if(arr[i]> arr[i+1])
			{
				if(Math.abs(temp[i] - temp[i+1])<1){
					temp[i] = temp[i]+1;
				}
			}
			else if(arr[i]==arr[i+1]){
				if(temp[i]> temp[i+1]){
					temp[i+1]=temp[i]-1;
				}
				else{
					temp[i+1]= temp[i];
				}
			}
		}
		return temp;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numberOfTests = s.nextInt();
		int[] arr = new int[numberOfTests];
		for(int i =0;i< numberOfTests; i++){
			arr[i]= s.nextInt();
		}
		
		long[] temp = orderRating(arr);
		long sum =0;
		for(int i =0; i< temp.length; i++){
			System.out.print(temp[i]+" ");
			sum = sum+ temp[i];
		}
		System.out.println();
		System.out.println(sum);
	}
}
