import java.util.*;
public class GemStones {

	public static String unique(char[] arr){
		String str="";
		HashSet<Character> hashSet = new HashSet<Character>();
		for(int i=0;i<arr.length; i++){			
			hashSet.add(arr[i]);			
		}
		for(Character c: hashSet){
			str += c;
		}
		return str;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numRocks = s.nextInt();
		HashMap<Character, Integer> map= new HashMap<Character,Integer>();
		for(int i = 0; i< numRocks; i++){
			String str = s.next();
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String uniqueString = unique(chars);
			char[] uniqueSorted = uniqueString.toCharArray();
			for(int j=0; j<uniqueSorted.length; j++){
				if(map.containsKey(uniqueSorted[j])==false){
					map.put(uniqueSorted[j], 1);
				}
				else{
					map.put(uniqueSorted[j], map.get(uniqueSorted[j])+1);
				}
			}
		}
		int count = 0;
		Set<Character> keys = map.keySet();
        for(Character key: keys){
            if(map.get(key)==numRocks){
            	count++;
            }
        }
        System.out.println(count);
	}

}
