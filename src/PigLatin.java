import java.util.*;
public class PigLatin {
	public static String piglatin(String word) {
		char[] chars = word.toCharArray();
		Character[] vowelList = new Character[] {'a','e','i','o','u','y'};
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.addAll(Arrays.asList(vowelList));
			
		if(vowels.contains(chars[0])){
			word += "way";
			return word;
		}
		else{
			String temp ="", newWord="";			
			for(int i=0; i<chars.length; i++){
				if(!vowels.contains(chars[i])){
					temp+=chars[i];
				}
				else{
					while(i!= chars.length){
						newWord+=chars[i];
						i++;
					}
					newWord+=temp+"ay";
				}
			}
			return newWord;
		}		
	}
	
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String word =  piglatin(str);
		System.out.println(word);
	}
}
