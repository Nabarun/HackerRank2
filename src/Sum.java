import java.io.*;
import java.util.*;

public class Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num=s.nextInt();
        int sum =0;
        for(int i=0; i< num; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            
            for(int j=0; j< n; j++){
                sum = a;
                for(int k=0; k<=j;k++){
                    sum = sum + ((int)Math.pow(2,k)*b);
                }
                System.out.print(sum +" ");
            }
            System.out.println();
        }
    }
}