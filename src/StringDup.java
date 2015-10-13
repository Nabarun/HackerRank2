import java.io.*;
import java.util.*;

public class StringDup {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean dup = false;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int numberOfTC = s.nextInt();
        for(int i =0;i< numberOfTC; i++){
        	map.clear();
        	dup=false;
            String str1= s.next();
            String str2 = s.next();
            for(Character c:str1.toCharArray()){
                if(map.get(c)==null){
                    map.put(c,1);
                }
            }
            for(Character c:str2.toCharArray()){
                if(map.get(c)!=null){
                    dup = true;
                    break;
                }
            }
            if(dup){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}