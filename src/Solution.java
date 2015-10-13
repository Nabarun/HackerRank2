import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Solution {

    static int pairs;
    private static String START = "";
    private static String END = "";
    
    private static Map<String, LinkedHashSet<String>> map = new HashMap();
    
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
    	int numberOfVertices = s.nextInt();
    	int numberOfTasks = s.nextInt();
    	int[] pointsA = new int[numberOfVertices-1];
        int[] pointsB = new int[numberOfVertices-1];
    	
    	for(int i=1; i<=numberOfVertices-1; i++){
    		
    		int pointA= s.nextInt();
    		int pointB = s.nextInt();
    		
    		pointsA[i-1] = pointA;
            pointsB[i-1] = pointB;
    		addTwoWayVertex(Integer.toString(pointA), Integer.toString(pointB));
    		
    	}
    	for(int i=1;i<=numberOfVertices-1; i++){
    		LinkedList<String> visited = new LinkedList();
        	START = Integer.toString(pointsA[i-1]);
            END = Integer.toString(pointsB[i-1]);
            visited.add(START);
            new Solution().breadthFirst(visited);
            visited.clear();
    	}
    	System.out.println(pairs);
    }

    private void breadthFirst(LinkedList<String> visited) {
        
    	LinkedList<String> nodes = adjacentNodes(visited.getLast());
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
            breadthFirst(visited);
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
    
    public static void addEdge(String node1, String node2) {
        LinkedHashSet<String> adjacent = map.get(node1);
        if(adjacent==null) {
            adjacent = new LinkedHashSet();
            map.put(node1, adjacent);
        }
        adjacent.add(node2);
    }

    public static void addTwoWayVertex(String node1, String node2) {
        addEdge(node1, node2);
        addEdge(node2, node1);
    }

    public boolean isConnected(String node1, String node2) {
        Set adjacent = map.get(node1);
        if(adjacent==null) {
            return false;
        }
        return adjacent.contains(node2);
    }

    public LinkedList<String> adjacentNodes(String last) {
        LinkedHashSet<String> adjacent = map.get(last);
        if(adjacent==null) {
            return new LinkedList();
        }
        return new LinkedList<String>(adjacent);
    }
}

