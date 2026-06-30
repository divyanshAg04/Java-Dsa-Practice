class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}

public class RangeSumQueryImmutable {
    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(nums);

        System.out.println(obj.sumRange(0, 2)); // 1
        System.out.println(obj.sumRange(2, 5)); // -1
        System.out.println(obj.sumRange(0, 5)); // -3
    }
}
