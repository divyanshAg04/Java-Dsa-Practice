import java.util.HashMap;

public class shortestCompletingWord {

    static class Solution {
        public String shortestCompletingWord(String licensePlate, String[] words) {

            licensePlate = licensePlate.toLowerCase();
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : licensePlate.toCharArray()) {
                if (Character.isLetter(c)) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }

            String res = "";

            for (String x : words) {
                x = x.toLowerCase();
                boolean b = true;

                for (char ch : map.keySet()) {
                    int count = 0;
                    for (char c : x.toCharArray()) {
                        if (c == ch) {
                            count++;
                        }
                    }

                    if (count < map.get(ch)) {
                        b = false;
                        break;
                    }
                }

                if (b && (res.equals("") || x.length() < res.length())) {
                    res = x;
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};

        System.out.println(sol.shortestCompletingWord(licensePlate, words));
    }
}