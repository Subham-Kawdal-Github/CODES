class Sum {

    static int numSum = 0;

    static int sum(int num) {
        if (num <= 0) {
            return numSum;
        }
        int l = num % 10;
        numSum = numSum + l;

        num = num / 10;
        return (sum(num));

    }

    public static void main(String[] args) {

        int s = sum(123);
        System.out.println(s);
    }
}
