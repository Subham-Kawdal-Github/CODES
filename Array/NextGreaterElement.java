package Array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int n = 24123;
        char[] ch = (n + "").toCharArray();

        int i = ch.length - 2;// -2 kyuki check krna h i+1 ko bhi
        while (i > 0 && ch[i] > ch[i + 1]) {
            i--;
        }

    }
}
