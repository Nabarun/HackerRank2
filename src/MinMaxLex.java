import java.util.*;

public class MinMaxLex {

	public int lexCode(Character ch){
		return ch;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String minStr = "";
        String maxStr = "";
        int subStringLength = s.nextInt();
        int count = 0;
        int start =0;
        while((count+(subStringLength-1))< str.length()){
            String subStr = str.substring(count,subStringLength+count);
            if(subStr=="d"){
            	System.out.println("Hi");
            }
            if(count==0){
            	maxStr = subStr;
            	minStr = subStr;
            }
            else{
	            start = 0;
	            while(start!= subStr.length() && maxStr.charAt(start) == subStr.charAt(start)){
	            	start ++;
	            }
	            if(start != subStr.length()){
	            	if(maxStr.charAt(start)<subStr.charAt(start)){
	            		maxStr = subStr;
	            	}
	            }
	            start = 0;
	            while(start!= subStr.length() && minStr.charAt(start) == subStr.charAt(start)){
	            	start ++;
	            }
	            if(start != subStr.length()){
	            	if(minStr.charAt(start)>subStr.charAt(start)){
	            		minStr = subStr;
	            	}
	            }
            }
            count++;
        }
        System.out.println(minStr);
        System.out.println(maxStr);
        s.close();
    }
}