import java.util.Arrays;
import java.util.HashSet;

public class intersection {
    public int[] findIntersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        intersection solver = new intersection();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(solver.findIntersection(nums1, nums2)));
    }
}
