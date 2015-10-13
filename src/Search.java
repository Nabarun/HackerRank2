import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
public class Search {
	static int sum;
    private static String START = "";
    private static String END = "";
    static HashMap<String,Integer> map = new HashMap<String, Integer>();
    public static void main(String[] args) {
    	   	
        Scanner s = new Scanner(System.in);
    	int numberOfVertices = s.nextInt();
    	int numberOfTasks = s.nextInt();
    	UndirectedBFS graph = new UndirectedBFS();
    	for(int i=1; i<=numberOfVertices-1; i++){
    		int pointA= s.nextInt();
    		int pointB = s.nextInt();
    		int weight = s.nextInt();
    		map.put(Integer.toString(pointA)+" "+Integer.toString(pointB), weight);
    		graph.addTwoWayVertex(Integer.toString(pointA), Integer.toString(pointB));
    		
    	}   	
    	LinkedList<String> visited = new LinkedList();
    	for(int i =0; i< numberOfTasks; i++){
    		int numberOfPoints = s.nextInt();
    		int[] points = new int[numberOfPoints];
    		for(int j=0; j< numberOfPoints; j++){
    			points[j] = s.nextInt();
    		}
    		for(int j=0; j< points.length-1; j++){
    			for(int k=j+1; k<points.length; k++){
    				
    				START = Integer.toString(points[j]);
    		        END = Integer.toString(points[k]);
    		        visited.add(START);
    		        new Search().breadthFirst(graph, visited);
    		        visited.clear();
    			}
    		}
    		System.out.println(sum);    		
    	}
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
        for (String node : visited) {
        	arr[count] = new Integer(node);            
            count++;
        }
        
        for(int i=0; i< arr.length-1; i++){
        	if(map.containsKey(arr[i]+" "+arr[i+1])){
        		sum = sum+map.get(arr[i]+" "+arr[i+1]);
        	}
        	else if(map.containsKey(arr[i+1]+" "+arr[i])){
        		sum = sum+map.get(arr[i+1]+" "+arr[i]);
        	}
        }
        
    }
}