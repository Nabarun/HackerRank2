import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class NextBigString {
	static String str ;
	static boolean flag = false;
	static String originalString;
	static String previous ="";
	protected static void permutation(String firstString){
		if(firstString.length()==1){
			return;
		}
		printPermutation(firstString,"");
	}
	protected static void printPermutation(String firstString, String permutation){
		
		if(firstString.length() == 0){
			if(previous.equals(originalString) && !permutation.equals(originalString)){
				System.out.println(permutation);
				flag=true;
			}			
			previous=permutation;
			return;
		}
		for(int i=0;i<firstString.length();i++){
			char toAppendToPermutation = firstString.charAt(i);
			String remaining = firstString.substring(0,i) + firstString.substring(i+1);
			
			printPermutation(remaining, permutation+toAppendToPermutation);			
		}		
	}	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numberOfTestCase = s.nextInt();
		for(int i = 0; i< numberOfTestCase; i++){
			originalString="";
			originalString = s.next();
			flag=false;
			char[] chars = originalString.toCharArray();
			Arrays.sort(chars);
			String sort = new String(chars);
			permutation(sort);
			if(flag==false){
				System.out.println("no answer");
			}			
		}
	}
}
