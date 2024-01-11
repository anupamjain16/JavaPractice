package javaProgramms;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate2 {

    public static void main(String[] args) {
        String a = "aabccdaaa";
        String b = removeDuplicates(a);
        System.out.println(b); // Output: abcd
    }

    private static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        
        Set<Character> seen = new HashSet<>();  // Use a set to efficiently track seen characters
        
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {  // Check if the character is already in the set
                sb.append(ch);
                seen.add(ch);  // Add the character to the set to mark it as seen
            }
        }
        return sb.toString();
    }
}
