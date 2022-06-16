import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSubArrayTest {
    @Test
    public void test(){
        assertEquals(10,LargestSubArray.largestSubArray(new int[]{1, 2, 3, 4}));
    }
}