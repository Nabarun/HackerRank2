import java.util.*;

public class BFSTraversal {
	TreeNode root;
	public void traverse(TreeNode root){
		this.root = root;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		root.isVisited = true;
		visit(root);
		while(q.isEmpty()){
			TreeNode t = q.remove();
			for(TreeNode c : root.neighbour.get(t)){
				if(!c.isVisited){
					c.isVisited = true;
					visit(c);
					q.add(c);
				}
			}				
		}		
	}
	
	public boolean visit(TreeNode node){
		if(root!=node){
			node.distance = node.distance+6;
		}
		else{
			node.distance = 0;
		}
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int numberOfTest =s.nextInt();
		int numberOfNodes = s.nextInt();
		int numberOfPath = s.nextInt();
		for(int i = 0; i< numberOfPath; i++){
			
		}
	}
}
