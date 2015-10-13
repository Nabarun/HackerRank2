import java.io.*;
import java.util.*;

public class SimpleClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        
        for(int i =0; i< testCase; i++){
            int numWords = s.nextInt();
            String[] strs = new String[numWords];
            boolean isLexSmall = true;
            
            for(int j=0; j< numWords; j++){
                String str = s.next();
                char[] chars = str.toCharArray();
                Arrays.sort(chars);  
                strs[j] = new String(chars);
            }
            for(int j=0; j<strs.length-1; j++){
            	for(int k=j+1; k<strs.length; k++){
            		char[] charsA = strs[j].toCharArray();
        			char[] charsB = strs[k].toCharArray();
        			if(charsA.length<=charsB.length){
        				for(int l=0; l< charsA.length; l++){
            				if(charsA[l] > charsB[l]){
            					isLexSmall = false;
            					break;
            				}
            			}
        			} 
        			else{
        				for(int l=0; l< charsB.length; l++){
            				if(charsA[l] > charsB[l]){
            					isLexSmall = false;
            					break;
            				}
            			}
        			}
            	}
            	if(!isLexSmall){
            		break;
            	}
            }
            if(isLexSmall){
            	System.out.println("YES");
            }
            else{
            	System.out.println("NO");
            }
        }
    }
}