import java.util.Queue;

public class DeQueue {
    public static void main(String[] args) {
        Queue<Integer> num = new ArrayDequeue<Integer>();

        num.offer(10);
        num.offerLast(27);
        num.offerFirst(52);

        System.out.println(num);
    }
}
