import java.util.HashMap;
import java.util.Scanner;

public class TrieHackerRank {
	private TrieHackerRank root;
	Character ch;
	HashMap<Character, TrieHackerRank> children = new HashMap<Character, TrieHackerRank>();		
	boolean isLeaf;
	public TrieHackerRank(){
		root = new TrieHackerRank(' ');
	}
	
	public TrieHackerRank(Character c){
		this.ch = c;
	}
	
	public boolean createTree(String str){
		HashMap<Character, TrieHackerRank> children = root.children;
		
		for(int i=0; i< str.length(); i++){
			char c = str.charAt(i);
			TrieHackerRank t;
			if(children.containsValue(null) && i != str.length()-1)
			{
				return false;
			}
			if(children.containsKey(c)){
				
				t= children.get(c);
			}
			else{
				t = new TrieHackerRank(c);
				children.put(c, t);
			}
			children = t.children;
			if(i==str.length()-1){
				children.put(c, null);
				t.isLeaf = true;
			}			
		}				
		return true;
	}
	
	public TrieHackerRank searchNode(String str){
		HashMap<Character, TrieHackerRank> children = root.children;
		TrieHackerRank t = null;
		for(int i = 0; i<str.length();i++){
			char c = str.charAt(i);
			if(children.containsValue(null)){
				return null;
			}
			if(children.containsKey(c)){
				t= children.get(c);
				children = t.children;
			}
			else{
				return null;
			}
		}
		
		return t;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numberOfTests = s.nextInt();
		TrieHackerRank t = new TrieHackerRank();
		boolean resp= false;
		for(int i =0; i< numberOfTests; i++){
			String str = s.nextLine();
			resp = t.createTree(str);
			if(!resp){
				break;
			}
		}	
		if(!resp){
			System.out.println("BAD SET");
		}
		else{
			System.out.println("GOOD SET");
		}
	}
}
