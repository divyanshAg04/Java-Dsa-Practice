public class isOneBitCharacter {

    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;

        while (i < n - 1) {
            i += bits[i] + 1;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] bits1 = {1, 0, 0};
        int[] bits2 = {1, 1, 1, 0};

        System.out.println(isOneBitCharacter(bits1)); // true
        System.out.println(isOneBitCharacter(bits2)); // false
    }
}