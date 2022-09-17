class KadanesAlgo {
    public static void main(String[] args) {

        // Used window sliding technique ....
        // |__|
        // Largest Sub Contiguous Array

        int[] arr = { -2, 10, -3, 4, -1, -2, 1, 5, -3 };
        int maxTillNow = 0;
        int a = 0;
        int sum = arr[0];
        for (int b = 1; b < arr.length; b++) {
            sum = sum + arr[b];
            if (sum < maxTillNow) {
                sum = sum - arr[a];
                a++;
            } else {
                maxTillNow = sum;
            }
        }

        System.out.println(maxTillNow);

    }
}