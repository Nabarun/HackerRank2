import java.io.*;
import java.util.*;

public class Simple {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfElements = s.nextInt();
        if(numberOfElements>=1 && numberOfElements <= 100){
            int positive=0; int negative=0; int zeros = 0;
            for(int i =0; i< numberOfElements; i++){
                int num = s.nextInt();
                if(num>=-100 && num <=100){
                    if(num<0){negative++;}
                    else if(num > 0){positive++;}
                    else if(num ==0){zeros++;}
                }
            }

            System.out.format("%.3f%n",((float)positive/(float)numberOfElements));
            System.out.format("%.3f%n",((float)negative/(float)numberOfElements));
            System.out.format("%.3f%n",((float)zeros/(float)numberOfElements));
        }
    }
}