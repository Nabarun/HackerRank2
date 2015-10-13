import java.math.BigInteger;
import java.util.*;

public class SimpleBit {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numberOfTestCase = s.nextInt();
		
		while(numberOfTestCase > 0)
		{
			BigInteger num = s.nextBigInteger();
			int count =0;
			while(!(num.compareTo(BigInteger.ZERO)>=1)){
				long power =  getPower(num);
				
				if(num.compareTo(BigInteger.valueOf((long)Math.pow(2, power)))==0){
					num = num.divide(BigInteger.valueOf(2));
				}
				else{
					num = num.subtract(BigInteger.valueOf((long)Math.pow(2, power)));
				}
				
				count++;
			}
			if(count%2 != 0){
				System.out.println("Richard");
			}
			else{
				System.out.println("Lousie");
			}
			numberOfTestCase --;
		}
	}
	
	public static int getPower(BigInteger num){
		int count = 0;
		while(!num.equals(BigInteger.ONE)){
			count ++;
			num = num.shiftRight(1);
		}
		return count;
	}
}
