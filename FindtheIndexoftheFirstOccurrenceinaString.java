public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        if (haystack == null || haystack.length() < needle.length()) {
            return -1;
        }
        int hLen = haystack.length();
        int nLen = needle.length();
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindtheIndexoftheFirstOccurrenceinaString solver = new FindtheIndexoftheFirstOccurrenceinaString();
        System.out.println(solver.strStr("hello", "ll")); // expected 2
        System.out.println(solver.strStr("aaaaa", "bba")); // expected -1
        System.out.println(solver.strStr("", "")); // expected 0
    }
}
