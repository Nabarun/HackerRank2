import java.io.*;
import java.util.*;

public class PanNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfTestCase = s.nextInt();
        boolean isValid = true;;
        for(int loop=0; loop< numberOfTestCase; loop++){
        	isValid = true;
            String str = s.next();

            if(str.length() != 10){
                System.out.println("NO");
                isValid = false;
                break;
            }
            for(int i = 0; i< str.length(); i++){
                if(i<5 && !(str.charAt(i)>='A' && str.charAt(i)<='Z')){
                    System.out.println("NO");
                    isValid = false;
                    break;
                }
                if(i>=5 && i<9 && !(str.charAt(i)>='0' && str.charAt(i)<='9')){
                    System.out.println("NO");
                    isValid = false;
                    break;
                }
                if(i==str.length()-1 && !(str.charAt(i)>='A' && str.charAt(i)<='Z')){
                    System.out.println("NO");
                    isValid = false;
                    break;
                }
            }
            if(isValid){
            	System.out.println("YES");
            }
        }
    }
}