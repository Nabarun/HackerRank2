import java.io.*;
import java.util.*;

public class Simple2 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numberOfTest = s.nextInt();
        for(int i =0; i< numberOfTest; i++){
            int dollarAmount = s.nextInt();
            int perChocolateRate = s.nextInt();
            int wrapperReturn = s.nextInt();
            int chocolate = dollarAmount / perChocolateRate;
            int divisor = chocolate/wrapperReturn;
            
            int net = chocolate-divisor*wrapperReturn;
            if(net<chocolate){
                chocolate = chocolate+net;    
            }
            chocolate = chocolate + (divisor);
            System.out.println(chocolate);
        }
    }
}