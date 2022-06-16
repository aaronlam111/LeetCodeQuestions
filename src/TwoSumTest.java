import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    int[] array = {1,2,3};
    int[] result = {0,2};

    @Test
    public void test1(){
        assertArrayEquals(result, TwoSum.twoSum(array, 4));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[]{0,3}, TwoSum.twoSum(new int[]{4,2,9,5}, 9));
    }

    @Test
    public void testHash1(){
        assertArrayEquals(result, TwoSum.twoSumHashMap(array, 4));
    }
}