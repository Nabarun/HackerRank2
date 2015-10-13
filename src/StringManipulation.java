import java.io.*;
import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean isLexSmall = true;
        int lengthA = A.length();
        int lengthB = B.length();
        int count=0;
        
        if(lengthA<=lengthB){
        	while(A.charAt(count) == B.charAt(count)){        		
        		if(count == lengthA-1){
        			isLexSmall = true;
        			break;
        		}
        		count++;
        	}
        	if(isLexSmall){
	        	if(A.charAt(count)>B.charAt(count)){
	                isLexSmall = false;                
	            }  
        	}
        	
        }
        else{
        	while(count<B.length() && A.charAt(count) == B.charAt(count)){
        		count++;        		
        	}
        	if(count == lengthB){
        		isLexSmall = false;
        	}
        	if(isLexSmall && count !=B.length()){
        		if(A.charAt(count)>B.charAt(count)){
                    isLexSmall = false;                
                }
        	}
        	        	            
        }
        
        System.out.println(lengthA+lengthB);
        if(!isLexSmall){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        Character firstA = Character.toUpperCase(A.charAt(0));;
        Character firstB = Character.toUpperCase(B.charAt(0));;
        System.out.print(firstA+A.substring(1)+" "+firstB+B.substring(1));
    }
}
