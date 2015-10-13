import java.util.*;
public class DigitFactorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();	
		if(num>=10 && num<=Math.pow(10, 5) )
		{
			for(long i= num; i>9; i--){
				long temp = i;
				long sum = 0;
				while(temp >0)
				{
					long d = temp % 10;
					if(d>0){
						long fact = fact(d);
						sum = sum + fact;
					}
					
					temp = temp /10;
				}
				if(i==9){
					System.out.println("Hi");
				}
				if(sum%i == 0){
					System.out.println(i);
				}
			}
		}
	}
	
	public static long fact(long num){
		if(num == 1){
			return num;
		}
		else{
			return num * fact(num-1);
		}
	}

}
