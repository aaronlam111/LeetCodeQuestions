import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    int[] nums = {1,2,3,1};
    @Test
    public void test(){
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

}