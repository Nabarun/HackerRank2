import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num >=1 && num <=10){
            for(int i = 0; i< num; i++){
                int numberOfStudent = s.nextInt();
                if(numberOfStudent>=1 && numberOfStudent <=1000){
                    int minimumReq = s.nextInt();
                    
                    if(minimumReq <= numberOfStudent){
                        for(int j = 0; j< numberOfStudent; j++){
                            int arrival = s.nextInt();
                            if(arrival <= 0){
                                minimumReq --;
                            }
                        }
                        if(minimumReq > 0){
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}