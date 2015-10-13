import java.util.Scanner;
public class DrawStaircase {
	
	static int totalHeight;
	public static void drawStaircase(int height){
		if(height == 1){
			for(int i=0; i< totalHeight-1; i++){
				System.out.print(" ");
			}
			System.out.println("#");
			return;
		}
		drawStaircase(height -1);
		for(int i=0; i< totalHeight-height; i++){
			System.out.print(" ");
		}
		for(int i=0; i< height; i++){
			System.out.print("#");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		totalHeight = height;
		drawStaircase(height);
	}
}
