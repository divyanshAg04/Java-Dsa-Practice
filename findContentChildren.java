import java.util.Arrays;

public class findContentChildren {

    public static int countContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int index = 0;

        while (index < s.length && child < g.length) {
            if (s[index] >= g[child]) {
                child++;
            }
            index++;
        }

        return child;
    }

    public static void main(String[] args) {

        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        System.out.println(countContentChildren(g, s));
    }
}
