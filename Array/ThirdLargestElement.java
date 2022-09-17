package Array;

public class ThirdLargestElement {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 20, 30, 10, 50, 60 };
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = max;
                max = arr[i];
            }

            if (arr[i] != max && arr[i] > secondLargest) {

                secondLargest = arr[i];
            }

            if ((arr[i] != max && arr[i] != secondLargest) && arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }
        System.out.println(
                "Max : " + max + " || Second Largest : " + secondLargest + " || Third Largest : " + thirdLargest);

    }
}
