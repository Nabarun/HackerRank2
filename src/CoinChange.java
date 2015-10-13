import java.util.*;

public class CoinChange {
	public static long[][] coinChangeSubProblem (ArrayList<Integer> coins, int total){
		long[][] coinChangeArr = new long[coins.size()][total+1];
		for(int i = 0; i< coins.size(); i++){
			for(int j=0; j<=total; j++){
				if(i == 0){
					if(j%coins.get(i)== 0){
						coinChangeArr[i][j]=1;
					}
					else{
						coinChangeArr[i][j]=0;
					}
				}				
				else if(j >= (coins.get(i))){
					coinChangeArr[i][j] = coinChangeArr[i-1][j] + coinChangeArr[i][j-coins.get(i)];
				}
				else{
					coinChangeArr[i][j]= coinChangeArr[i-1][j];
				}				 
			}
		}
		return coinChangeArr;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int totalAmount = s.nextInt();		
		int numberOfCoinsInaSet = s.nextInt();
		
		if(totalAmount <= 0){
			return;
		}
		
		ArrayList<Integer> coins = new ArrayList<Integer>();
		for(int i =0; i< numberOfCoinsInaSet; i++){
			int denom = s.nextInt();
			if(denom < 0){
				return;
			}
			coins.add(denom);
		}	
		Collections.sort(coins);	
		long[][] arr = coinChangeSubProblem(coins, totalAmount);
		System.out.println(arr[coins.size()-1][totalAmount]);
	}
}
