import java.util.*;

public class nextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            nextGreater[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater[nums1[i]];
        }

        return ans;
    }

    public static void main(String[] args) {

        // Test Case
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println("Output:");
        System.out.println(Arrays.toString(result));
    }
}