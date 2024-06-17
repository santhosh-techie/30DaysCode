/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
* An Anagram is a word or phrase formed by rearranging the letters of a different
* word or phrase, typically using all the original letters exactly once.
* */

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c= s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) return false;
        }

        return true;

    }

    public static void main(String... args) {
        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram.isAnagram(s, t));
        s = "rat";
        t = "car";
        System.out.println(validAnagram.isAnagram(s, t));
    }

}
