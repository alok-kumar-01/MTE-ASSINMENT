import java.util.HashMap;

public class Q40 {
    public static int findMaxFrequencyElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
      
        int maxFrequency = 0;
        int maxElement = -1;
        
        for (int num : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(num);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = num;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 2, 2, 1, 3, 3, 3};
        int result = findMaxFrequencyElement(nums);
        System.out.println("Element with maximum frequency: " + result);
    }
}
