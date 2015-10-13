import java.io.*;
import java.util.*;

public class GameOfThrones {

    public static void main(String[] args) {
    	boolean isPalindrome = true;
    	int count = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        for(char ch:chars){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }
        for(Integer i: map.values()){
        	if(i==1){
        		count++;
        		if(count>1){
        			isPalindrome = false;
        		}
        	}
        }
        if(isPalindrome){
        	System.out.println("YES");
        }
        else{
        	System.out.println("NO");
        }
    }
}