import java.util.HashMap;

/*
* Given a pattern and a string s, find if s follows the same pattern.
* Example 1:
* Input: pattern = "abba", s = "dog cat cat dog"
* Output: true
* Example 2:
* Input: pattern = "abba", s = "dog cat cat fish"
* Output: false
* */
public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        HashMap map_index = new HashMap();
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        for(int i=0; i<words.length; i++){
            char c = pattern.charAt(i);
            String w = words[i];

            if(!map_index.containsKey(c)) map_index.put(c, i);

            if(!map_index.containsKey(w)) map_index.put(w,i);

            if(map_index.get(c) != map_index.get(w)) return false;
        }

        return true;
    }

    public static void main(String... args) {
        //pass case
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
        // fail case
        pattern = "abba";
        s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }
}
