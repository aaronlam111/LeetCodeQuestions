import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumHashMap(int[] numbers, int target){
        HashMap<Integer, Integer> seen = new HashMap();
        for(int i = 0; i < numbers.length; i++){
            int j = target - numbers[i];
            if(seen.containsKey(j)){
                return new int[]{seen.get(j), i};
            }
            seen.put(numbers[i], i);
        }
        return new int[]{};
    }
}

