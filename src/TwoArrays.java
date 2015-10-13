import java.io.*;
import java.util.*;

public class TwoArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while(test>0)
        {
            int numberOfTest = s.nextInt();
            int sum = s.nextInt();
            HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
            
            for(int i=0; i< numberOfTest; i++){
            	int num = s.nextInt();
                if(!arrMap.containsKey(num)){
                	arrMap.put(num, 1);
                }    
                else{
                	arrMap.put(num, arrMap.get(num)+1);
                }
            }
            boolean isTwoArrays = true;
            int[] b = new int[numberOfTest];
            for(int i=0; i< numberOfTest; i++){            	
            	b[i] = s.nextInt();
            }
            for(int i =0; i< b.length; i++){
	            int netSum = sum -b[i];
	        	if(!arrMap.containsKey(netSum)){
	        		System.out.println("NO");
	        		isTwoArrays = false;
	        		break;
	        	}
	        	else{
	        		arrMap.put(netSum, arrMap.get(netSum)-1);
	        	}
            }
            if(isTwoArrays){
            	for(int val : arrMap.values())
            	{
            		if(val != 0){
            			System.out.println("NO");
                		isTwoArrays = false;
                		break;
            		}            	
            	}
            	
            }
            if(isTwoArrays){
            	System.out.println("YES");
            }
            
        }
    }
}