import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) { return true; }
            seen.add(num);
        }
        return false;
    }
}