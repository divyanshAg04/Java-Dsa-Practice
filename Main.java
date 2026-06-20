import java.util.*;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // nums1 ke elements set me daalo
        for (int num : nums1) {
            set.add(num);
        }

        // Common elements result me daalo
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // HashSet ko array me convert karo
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i] = num;
            i++;
        }

        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array input
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        // Second array input
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] res = sol.intersection(nums1, nums2);

        System.out.print("Intersection: ");
        for (int x : res) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}