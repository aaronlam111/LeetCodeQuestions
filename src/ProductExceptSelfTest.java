import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {
    int[] array = {1,2,3,4};
    int[] result = {24,12,8,6};
    @Test
    public void test(){
        assertArrayEquals(result, ProductExceptSelf.productExceptSelf(array));
    }

}