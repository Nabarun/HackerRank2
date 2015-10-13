import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class BFS2 {
	static int pairs;
    private static String START = "";
    private static String END = "";
    static HashMap<String,Integer> map = new HashMap<String, Integer>();
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
    	int numberOfVertices = s.nextInt();
    	int numberOfTasks = s.nextInt();
    	ArrayList<TreePoint> points = new ArrayList<TreePoint>();
    	UndirectedBFS graph = new UndirectedBFS();
    	for(int i=1; i<=numberOfVertices-1; i++){
    		TreePoint t = new TreePoint();
    		int pointA= s.nextInt();
    		int pointB = s.nextInt();
    		t.pointA = pointA;
    		t.pointB = pointB;
    		points.add(t);
    		graph.addTwoWayVertex(Integer.toString(pointA), Integer.toString(pointB));
    		
    	}
    	for(TreePoint item: points){
    		LinkedList<String> visited = new LinkedList();
        	START = Integer.toString(item.pointA);
            END = Integer.toString(item.pointB);
            visited.add(START);
            new BFS2().breadthFirst(graph, visited);
            visited.clear();
    	}
    	System.out.println(pairs);
    }

    private void breadthFirst(UndirectedBFS graph, LinkedList<String> visited) {
        
    	LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
        // examine adjacent nodes
        for (String node : nodes) {
            if (visited.contains(node)) {
                continue;
            }
            if (node.equals(END)) {
                visited.add(node);
                printPath(visited);
                visited.removeLast();
                break;
            }
        }
        // in breadth-first, recursion needs to come after visiting adjacent nodes
        for (String node : nodes) {
            if (visited.contains(node) || node.equals(END)) {
                continue;
            }
            visited.addLast(node);
            breadthFirst(graph, visited);
            visited.removeLast();
        }
    }

    private void printPath(LinkedList<String> visited) {
    	int count = 0;
    	int[] arr = new int[visited.size()];
    	if(visited.size() ==2){
	        pairs++;
    	}
    }
}