import java.util.Arrays;
import java.util.Scanner;

public class arrayPairSum {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size (must be even)
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = arrayPairSum(nums);

        System.out.println("Maximum Sum of Pair Minimums: " + result);

        sc.close();
    }
}