import java.util.*;

public class numberOfLines {

    public int[] numberOfLines(int[] widths, String s) {
        if (s.length() == 0)
            return new int[]{0, 0};

        int[] ans = new int[]{1, 0};
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int temp = widths[s.charAt(i) - 'a'];

            if (temp + sum <= 100) {
                sum += temp;
            } else {
                ans[0]++;
                sum = temp;
            }
        }

        ans[1] = sum;
        return ans;
    }

    public static void main(String[] args) {
        numberOfLines obj = new numberOfLines();

        int[] widths = {
            10,10,10,10,10,10,10,10,10,10,
            10,10,10,10,10,10,10,10,10,10,
            10,10,10,10,10,10
        };

        String s = "abcdefghijklmnopqrstuvwxyz";

        int[] result = obj.numberOfLines(widths, s);

        System.out.println(result[0] + " " + result[1]);
    }
}