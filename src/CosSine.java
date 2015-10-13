import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class CosSine {
    
    public static double getAns(double num, int pow){
    	double sum = 0;
        int count =0;
        
       
        while(pow >= 0 ){        	
            sum = (sum + Math.pow(-1,count)* (Math.pow(num, pow)/(fact(pow))));            
            pow= pow-2;
            count++;
        }
        return sum;
    }
    
    public static double fact( double num){
        if(num == 1 || num ==0){
            return 1;
        }
        return fact(num-1)*num;
    }
    
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int testCase = s.nextInt();
    	DecimalFormat df = new DecimalFormat("#.000");
    	for(int i =0; i< testCase; i++){
    		double num = s.nextDouble();
    		double sinVal = getAns(num,9);
    		double cosVal = getAns(num,8);
    		
    		sinVal = new Double(df.format(sinVal));
    		System.out.println(sinVal);
    		cosVal = new Double(df.format(cosVal));
    		System.out.println(cosVal);
    	}
    }
}