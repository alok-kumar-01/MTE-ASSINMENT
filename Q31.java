import java.util.Deque;
import java.util.LinkedList;

public class Q31 {

    public static void slidingWindowMax(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return;
        }
        Deque<Integer> deque = new LinkedList<>();

        
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();  
            }
            deque.addLast(i);
        }

      
        System.out.print(nums[deque.peekFirst()] + " ");
        for (int i = k; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
            System.out.print(nums[deque.peekFirst()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        slidingWindowMax(nums, k); 
    }
}
