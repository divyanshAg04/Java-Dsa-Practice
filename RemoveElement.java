public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int insertIndex = 0;

        for (int num : nums) {
            if (num != val) {
                nums[insertIndex++] = num;
            }
        }

        return insertIndex;
    }

    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int length = solver.removeElement(nums, 3);

        System.out.println(length);
    }
}
