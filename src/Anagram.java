import java.io.*;
import java.util.*;

public class Anagram {

   static boolean isAnagram(String A, String B) {
      if(A.length()!=B.length()){
          return false;
      }
      A = A.toLowerCase();
      B = B.toLowerCase();
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      for(int i=0; i< A.length(); i++){
          if(!map.containsKey(A.charAt(i))){
              map.put(A.charAt(i), 1);
          }
          else{
              map.put(A.charAt(i), map.get(A.charAt(i))+1);
          }
      }
      for(int i=0; i< B.length(); i++){
          if(!map.containsKey(B.charAt(i))){
              return false;
          }
          else{
        	  map.put(B.charAt(i), map.get(B.charAt(i))-1);
          }
      }
      for(int value: map.values()){
          if(value!=0){
              return false;
          }
      }
       return true;
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
