public class LargestSubArray {
    public static int largestSubArray(int[] nums){
        int largestSeenSoFar = nums[0];
        int largestRightNow = nums[0];
        for(int i = 1; i < nums.length; i++){
            largestRightNow = Math.max(largestRightNow+nums[i], nums[i]);
            largestSeenSoFar = Math.max(largestRightNow, largestSeenSoFar);
        }
        return largestSeenSoFar;
    }
}
