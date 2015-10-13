import java.io.*;
import java.util.*;

public class SetString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        HashSet<String> set = new HashSet<String>();
        s.nextLine();
        for(int i = 0; i< testCase; i++){
            set.add(s.nextLine());
            System.out.println(set.size());
        }
    }
}