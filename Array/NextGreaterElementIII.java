public class NextGreaterElementIII {
    public static void main(String[] args) {
        int n = 67354;
        String number = Integer.toString(n);
        char[] arr = number.toCharArray();

        // Find first dip
        int i = arr.length - 1;
        while (i >= 0 && arr[i] > arr[i + 1]) {
            i--;
        }
        if (i == -1) {
            System.out.println("-1");

        }

        // Find greater than {i}th element
        int k = arr.length - 1;
        while (arr[i] > arr[k]) {
            k--;
        }
        // swap i and j values
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        // concat from 0 to i
        String res = "";
        for (int j = 0; j <= i; j++) {
            res = res + arr[j];
        }
        // concat from k to i+1 index(reverse)
        for (int j = arr.length - 1; j > i; j--) {
            res += arr[j];
        }
        System.out.println(res);
    }
}
