public class Lengthoflastword {

    public static int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // 5
    }
}