import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;
        int start =0;
        int end = A.length()-1;
        while(start <= end){
        	if(A.charAt(start)!=A.charAt(end)){
        		isPalindrome = false;
        		break;
        	}
        	start++;
        	end--;
        }
        if(isPalindrome){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
    }
}
