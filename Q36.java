import java.util.ArrayList;
import java.util.List;

public class Q36 {
     public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }
        currentSubset.add(nums[index]);
        generateSubsets(nums, index + 1, currentSubset, result);
        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(nums, index + 1, currentSubset, result);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = subsets(nums);
        
        System.out.println("All subsets:");
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}
