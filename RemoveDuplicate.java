
import java.util.*;

public class RemoveDuplicate{
    public static void main(String[] args) {  // By Using inBuilt Methods
        
        String name = "Guruprasad";
        System.out.println(removeDuplicate(name));
    }

    private static String removeDuplicate(String name) {

        Set<Character> set =new HashSet<>();
        StringBuffer sf = new StringBuffer();

        for(int i =0; i<name.length(); i++){
            Character c = name.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sf.append(c);
            }
        }

        return sf.toString();
        }
}