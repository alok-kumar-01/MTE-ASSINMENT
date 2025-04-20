/*### Sliding Window Technique (Concise Theory):

The **sliding window technique** is an efficient method for solving problems related to finding subarrays or substrings within a specified range or window in an array or string. It is particularly useful when the problem involves examining contiguous elements.

#### Key Idea:
- A **window** is a subarray or substring that slides over the array/string.
- The window moves from left to right, expanding or shrinking based on the problem's requirements.
- Instead of recalculating values (like sums or counts) for every subarray, we maintain and update a running calculation as the window slides.

#### Types of Sliding Windows:
1. **Fixed-size window**: The size of the window remains constant, e.g., finding the maximum sum of subarrays of size `k`.
2. **Variable-size window**: The window size changes dynamically based on conditions, e.g., finding the longest subarray with at most `k` distinct elements.

#### Common Applications:
1. **Maximum/Minimum Sum of Subarray of Fixed Size**: 
   - Calculate the sum of a subarray of size `k` and slide the window to find the maximum or minimum sum.
   
2. **Longest Subarray with At Most K Distinct Elements**: 
   - Find the longest contiguous subarray with no more than `k` distinct elements.
   
3. **Longest Substring Without Repeating Characters**: 
   - Find the length of the longest substring that does not have repeating characters.
   
4. **Subarray Sum Equal to Target**: 
   - Find the subarray whose sum equals a given target.

#### Time and Space Complexity:
- **Time Complexity**: `O(n)` (each element is processed at most twice).
- **Space Complexity**: `O(k)` for tracking elements (like using a frequency map), or `O(1)` if only simple variables are used.

### Benefits:
- Reduces the time complexity from `O(n^2)` (brute force) to `O(n)` in many problems.
- Efficient handling of dynamic subarrays or substrings without redundant recalculations.

 */
public class Q33 {
    public class SlidingWindow {

        public static int maxSumSubarray(int[] arr, int k) {
            int n = arr.length;
            if (n < k) return -1; 
            
            int maxSum = 0;
            for (int i = 0; i < k; i++) {
                maxSum += arr[i];
            }
            
            int windowSum = maxSum;
            for (int i = k; i < n; i++) {
                windowSum += arr[i] - arr[i - k];
                maxSum = Math.max(maxSum, windowSum);
            }
            
            return maxSum;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;
            System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(arr, k));
        }
    }
    
}
