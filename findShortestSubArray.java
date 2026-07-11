import java.util.*;

public class findShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        for (int key : count.keySet()) {
            maxCount = Math.max(maxCount, count.get(key));
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int windowSize = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;

        int i = 0, j = 0;

        while (j < nums.length) {
            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
            windowSize = Math.max(windowSize, hm.get(nums[j]));

            while (windowSize == maxCount) {
                res = Math.min(res, j - i + 1);

                hm.put(nums[i], hm.get(nums[i]) - 1);

                if (hm.get(nums[i]) == 0) {
                    hm.remove(nums[i]);
                }

                if (nums[i] == nums[j]) {
                    windowSize--;
                }

                i++;
            }

            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        findShortestSubArray obj = new findShortestSubArray();

        int[] nums = {1, 2, 2, 3, 1, 4, 2};

        System.out.println("Shortest Subarray Length = " + obj.findShortestSubArray(nums));
    }
}