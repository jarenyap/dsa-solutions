import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return false;}
        HashMap<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            seen.put(c, seen.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            seen.put(c, seen.getOrDefault(c, 0) - 1);
        }
        for (int count : seen.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}