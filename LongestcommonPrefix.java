import java.util.*;

public class LongestcommonPrefix {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();

        Arrays.sort(v);

        String first = v[0];
        String last = v[v.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        LongestcommonPrefix sol = new LongestcommonPrefix();
        String result = sol.longestCommonPrefix(arr);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}
