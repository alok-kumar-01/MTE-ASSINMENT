public class Q50 {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int total = 0, left = 0;
        for (int num : arr) total += num;
        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];
            if (left == total) {
                System.out.println("Equilibrium index: " + i);
                return;
            }
            left += arr[i];
        }
    }
}
