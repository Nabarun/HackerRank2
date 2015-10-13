import java.util.Scanner;
import java.util.Stack;
class Stack1{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack<Character> st = new Stack<Character>();
      
      boolean isBalanced = false;
      while (sc.hasNext()) {
         String input=sc.next();
         st.clear();
         isBalanced = false;
         for(int i = 0; i<input.length(); i++){
        	 
             if(input.charAt(i) == '(' || input.charAt(i)=='{' || input.charAt(i)=='['){
                 st.push(input.charAt(i));
             }
             else{
            	 if(!st.isEmpty()){
	            	 Character c = st.pop();
	            	 Character d = input.charAt(i);
	            	 if((d==')' && c=='(')||(d=='}' && c=='{')||(d==']' && c=='[')){
	            		 isBalanced = true;
	            	 }
	            	 else{
	            		 isBalanced = false;
	            		 break;
	            	 }
            	 }
            	 else{
            		 isBalanced=false;
            		 break;
            	 }
             }
         }
         if(!st.empty()){
        	 System.out.println("false");
         }
         else if(isBalanced){
        	 System.out.println("true");
         }
         else{
        	 System.out.println("false");
         }
      }
      
   }
}
