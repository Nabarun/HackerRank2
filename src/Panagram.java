import java.io.*;
import java.util.*;

public class Panagram {
    protected static boolean isPana;
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        boolean[] charSet = new boolean[1000];
        char[] charArr = str.toCharArray();
        for(char ch:charArr){
        	if(ch != ' '){
	            if(!charSet[ch]){
	                charSet[ch]=true;	                
	            }	            
        	}
        }
        for(int i = 'a'; i<'z'; i++){
        	if(charSet[i] == false){
        		isPana = false;
        		break;
        	}
        	isPana=true;
        }
        if(isPana){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}