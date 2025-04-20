import java.util.*;

public class Q48 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
        }
        Arrays.sort(nums, i + 1, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
