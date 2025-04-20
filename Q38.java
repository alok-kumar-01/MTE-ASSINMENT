import java.util.ArrayList;
import java.util.List;

public class Q38 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> currentPermutation, List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (currentPermutation.contains(nums[i])) {
                continue;
            }
            currentPermutation.add(nums[i]);
            backtrack(nums, currentPermutation, result);
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);

        System.out.println("All permutations:");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
