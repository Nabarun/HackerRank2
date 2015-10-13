import java.util.Scanner;
import java.util.ArrayList;

public class GameTheory {
       
    protected static int xorValues(ArrayList<Integer> nums){
        int prod = -1;
        if(nums.size() > 1){
            prod = nums.get(0)^nums.get(1);
            int i=2;
            while(i<nums.size()){
                prod = prod ^ nums.get(i);
                i++;
            }
        }   
        return prod;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numOfTest = s.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for(int i=0; i<numOfTest; i++){
            int numBuckets = s.nextInt();
            for(int j=0; j< numBuckets; j++){
            	nums.add(s.nextInt());
            }
            int xorValue = xorValues(nums);
            if(xorValue==0){
            	System.out.println("Sandy");
            }
            else{
            	System.out.println("Mansa");
            }
        }
    }
}