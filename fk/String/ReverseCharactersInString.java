public class ReverseCharactersInString {

    // public static String reverseCharactersInString(String str) {

    // // Reverse whole string Using stringbuilder
    // // StringBuilder input1 = new StringBuilder();
    // // input1.append(str);
    // // input1.reverse();
    // // System.out.println(input1);

    // // String rev = new StringBuilder(str).reverse().toString();
    // // System.out.println(rev);

    // String words[] = str.split("\\s");
    // String reverseWord = "";
    // for (String s : words) {
    // StringBuilder sb = new StringBuilder(s);
    // sb.reverse();
    // reverseWord = reverseWord + sb.toString() + " ";
    // }

    // return reverseWord.trim();

    // }

    public static void main(String[] args) {
        String str = "Hello World";

        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String s : words) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            reverseWord = reverseWord + sb.toString() + " ";
        }
        reverseWord = reverseWord.trim();
        System.out.println(reverseWord);
    }
}
