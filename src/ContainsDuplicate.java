import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(seen.contains(nums[i])) return true;
            seen.add(nums[i]);
        }
        return false;
    }
}
