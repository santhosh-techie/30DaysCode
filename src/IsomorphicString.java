import java.util.HashMap;

/*
* Given two strings s and t, determine if they are isomorphic.
* Two strings s and t are isomorphic if the characters in s can be replaced to get t.
* All occurrences of a character must be replaced with another character
* while preserving the order of characters. No two characters may map to the same character,
*  but a character may map to itself.
* */
/*
* Conclusion: you have to map from both separately t->s && s->t ;
*  IF any char point to two separate val then it's not isomorphic
* */
public class IsomorphicString {

    public static String transformString(String s) {
        HashMap<Character, Integer>  indexMapping = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);
            if(!indexMapping.containsKey(c)){
                indexMapping.put(c, i);
            }

            sb.append(indexMapping.get(c));
            sb.append(" ");
        }
        return sb.toString();

    }

    public static boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }

    public static void main(String[] args) {
       //pass case
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
        //fail case
        s = "foo";
        t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
}
