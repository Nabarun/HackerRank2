//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Dictionary{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map<String, String> map= new HashMap<String, String>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         if(!map.containsKey(name)){
        	 map.put(name,name+"="+phone);
         }
         
         in.nextLine();
      }
      boolean isFound = false;
      while(in.hasNext())
      {
    	  isFound = false;
         String s=in.nextLine();
         if(!map.containsKey(s)){
        	 System.out.println("Not found");
         }
         else{
        	 System.out.println(map.get(s));
         }
      }
   }
}
