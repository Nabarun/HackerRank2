import java.util.ArrayList;
import java.util.HashMap;
public class Trie {
	private TreeNode root;
	public Trie(){
		root = new TreeNode();
	}
	public void createTree(String str){
		HashMap<Character, TreeNode> children = root.children;
		
		for(int i=0; i< str.length(); i++){
			char c = str.charAt(i);
			TreeNode t;
			if(children.containsKey(c)){
				t= children.get(c);
			}
			else{
				t = new TreeNode(c);
				children.put(c, t);
			}
			children = t.children;
			if(i==str.length()-1){
				children.put(c, null);
				t.isLeaf = true;
			}
		}						
	}
	
	public boolean startsWith(String prefix){
		if(searchNode(prefix)==null){
			return false;
		}
		else {
			return true;
		}
	}
	public boolean search(String word){
		TreeNode t = searchNode(word);
		
		if(t!=null && t.isLeaf){
			return true;
		}
		else{
			return false;
		}
	}
	
	public TreeNode searchNode(String str){
		HashMap<Character, TreeNode> children = root.children;
		TreeNode t = null;
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
		
		Trie t = new Trie();
		t.createTree("aab");
		t.createTree("defgab");
		t.createTree("abcde");
		t.createTree("aabcde");
		t.createTree("cedaaa");
		t.createTree("bbbbbbbbbb");
		t.createTree("jabjjjad");
		
		boolean searchResp = t.search("aabc");
		System.out.println(searchResp);
	}
}
