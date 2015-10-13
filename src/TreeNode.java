import java.util.*;

public class TreeNode {
	Character ch;
	Integer distance;
	int d;
	boolean isVisited;
	ArrayList<TreeNode> neighbour = new ArrayList<TreeNode>();
	HashMap<Character, TreeNode> children = new HashMap<Character, TreeNode>();
	public TreeNode(Character c){
		this.ch = c;
	}
	public TreeNode(int d){
		this.d = d;
	}
	public TreeNode(){}
	
	boolean isLeaf;
	
	public ArrayList<TreeNode> getAdjacent(HashMap<TreeNode, ArrayList<TreeNode>> map, TreeNode search){
		if(map.containsKey(search)){
			return map.get(search);
		}
		return null;
	}
}

