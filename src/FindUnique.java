import java.io.*;
import java.util.*;

public class FindUnique {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numberOfTests = s.nextInt();
        long checker = 0;
        int[] arr = new int[numberOfTests];
        ArrayList<Integer> dup = new ArrayList<Integer>();
        for(int i=0; i< numberOfTests; i++){
            arr[i] = s.nextInt();            
            checker = checker ^ arr[i];
            
        }
        System.out.println(checker);       
    }
}