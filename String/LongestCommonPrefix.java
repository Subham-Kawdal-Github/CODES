public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // char[] res = strs[0].toCharArray();

        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < s.length()) {
                s = strs[i];
            }
        }
        char[] res = s.toCharArray();
        String result = "";

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            result = "";
            for (int j = 0; j < res.length; j++) {
                if (res[j] == temp[j]) {
                    result = result + res[j] + "";
                } else if (res[j] != temp[j]) {
                    res = result.toCharArray();
                    break;
                }

            }
        }
        return result;

    }

    public static void main(String[] args) {
        String[] str = { "floner", "flow", "floght" };
        String s = longestCommonPrefix(str);
        System.out.println(s);

    }
}
