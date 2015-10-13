import java.util.Scanner;
public class Utopian {
	public static int cycle(int height, int c, int num){
		
		while(c<num){
			if(c%2==0){			
				height = height+height;				
			}
			else{				
				height = height +1;				
			}
			c++;
		}
		return height;
	}
	 public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		 int numberOfTests = s.nextInt();
		 for(int i=0; i< numberOfTests; i++){
			 int cycle = s.nextInt();
			 int height = cycle(1,0,cycle);
			 System.out.println(height);
		 }
	 }
}
