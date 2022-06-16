import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {
    int[] prices = {7,1,5,3,6,4};
    int[] pricesNoProfit = {7,6,4,3,1};

    @Test
    public void test(){
        assertEquals(5,MaxProfit.maxProfit(prices));
    }

    @Test
    public void testNoProfit(){
        assertEquals(0,MaxProfit.maxProfit(pricesNoProfit));
    }

    @Test
    public void testNTime(){
        assertEquals(5,MaxProfit.maxProfitNTime(prices));
    }

    @Test
    public void testNoProfitNTime(){
        assertEquals(0,MaxProfit.maxProfitNTime(pricesNoProfit));
    }
}