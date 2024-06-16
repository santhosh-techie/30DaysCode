/*
* Given two strings ransomNote and magazine, return true if ransomNote
* can be constructed by using the letters from magazine and false otherwise.
* Each letter in magazine can only be used once in ransomNote.
*
* */
import java.util.HashMap;
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character, Integer> magazineLetters = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineLetters.put(c, magazineLetters.getOrDefault(c, 0) + 1);
        }

        for (char r : ransomNote.toCharArray()) {
            int currentCount = magazineLetters.getOrDefault(r, 0);
            if (currentCount == 0) {
                return false;
            }
            magazineLetters.put(r, currentCount - 1);
        }

        return true;

    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

}
