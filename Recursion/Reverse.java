public class Reverse {

    static String reverseString(String str) {
        // termination case
        if (str.length() == 1) {
            return String.valueOf(str.charAt(0)); // Convert char into a String

        }
        // Small Problem
        String smallString = str.substring(1);
        char singleChar = str.charAt(0);
        String r = reverseString(smallString);
        r = r + singleChar;
        return r;
    }

    public static void main(String[] args) {
        String name = "amit";
        String result = reverseString(name);
        System.out.println(result);

    }
}
