class NotSufficientBalanceException extends java.lang.RuntimeException {
    NotSufficientBalanceException(String msg) {
        System.out.println(msg);
    }
}

public class tryExcept {

    public static void main(String[] args) {
        try {
            checkBalance(4000);
        } catch (java.lang.RuntimeException e) {
            System.out.println(e);
        }
    }

    public static void checkBalance(int balance) throws NotSufficientBalanceException {
        if (balance < 5000) {
            throw new NotSufficientBalanceException("Balance is less than 5000");
        } else {
            System.out.println("Balance is more than 5000");
        }
    }
}
