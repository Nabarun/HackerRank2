import java.util.*;
public class ExclusiveInclusive {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int number = s.nextInt();
		int inclusive = 0;
		int exclusive =0;
		int temp =0;
		int[] arr = new int[number];
		for(int i = 0; i< number; i++){
			arr[i]=s.nextInt();
			temp = inclusive;
			inclusive = Math.max(arr[i]+exclusive, inclusive);
			exclusive = temp;
		}
		for(int i:arr){
			System.out.print(i+" ");			
		}
		System.out.println();
		System.out.println(inclusive);
	}

}
