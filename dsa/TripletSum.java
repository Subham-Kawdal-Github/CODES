public class TripletSum {

    // tripletSum(){

    // }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 6, 2, 3, 5, 9 };
        int n = 20;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    if (arr[i] + arr[j] + arr[j2] == n) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[j2]);
                    }
                }
            }
        }
    }
}
