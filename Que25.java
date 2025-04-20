import java.util.*;

public class Que25 {

  public static int[] nextGreater(int[] arr) {
    int n = arr.length;
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
    
      while (!stack.isEmpty() && stack.peek() <= arr[i]) {
        stack.pop();
      }

   
      result[i] = stack.isEmpty() ? -1 : stack.peek();

      
      stack.push(arr[i]);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 7, 5, 2, 11 };
    int[] res = nextGreater(arr);

    System.out.println("Input:  " + Arrays.toString(arr));
    System.out.println("Output: " + Arrays.toString(res));
  }
}
