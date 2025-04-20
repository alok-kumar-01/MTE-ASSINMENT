import java.util.HashMap;

public class Q34 {
    public static boolean subarraySumEqualsK(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int prefixSum = 0;
        
        for (int num : nums) {
            prefixSum += num;
            if (map.containsKey(prefixSum - k)) {
                return true;
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return false; 
    }

    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        
        if (subarraySumEqualsK(nums, k)) {
            System.out.println("Yes, there exists a subarray with sum equal to " + k);
        } else {
            System.out.println("No, there is no subarray with sum equal to " + k);
        }
    }
}
