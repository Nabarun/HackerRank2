import java.io.*;
import java.util.*;
import java.lang.*;

public class SimpleTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfTest = s.nextInt();
        int count =0;
        for(int i=0; i< numberOfTest; i++){
            count = 0;
            int a = s.nextInt();
            int b = s.nextInt();
            double aSqrt = Math.sqrt(a);
            double bSqrt = Math.sqrt(b);
            int numbers = (int)(Math.floor(bSqrt)- Math.floor(aSqrt));
            if(numbers == 0){
            	if(aSqrt == Math.floor(aSqrt)){
            		numbers=1;
            	}
            }
            System.out.println(numbers);
        }
    }
}