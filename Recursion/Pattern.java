
public class Pattern {
    static void leftPyramid(int n, int row) {
        // Termination Case
        if (row > n) {
            return;
        }
        // Processing Logic
        printStar(row);
        System.out.println(); // New Line
        // Small Problem (row + 1)
        leftPyramid(n, row + 1); // Row Increase

    }

    static void printStar(int noOfStars) {
        // Termination case
        if (noOfStars == 0) {
            return;
        }
        // Processing Logic
        System.out.print("*");
        // Small Problem (noOfStars - 1)
        printStar(noOfStars - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        leftPyramid(n, row);
    }
}
