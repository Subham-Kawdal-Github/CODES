import java.util.Queue;

//Stack pop Efficient or either push efficient
//this is pop efficient i.e doing pop effficiently
public class StackUsingQueue {

    Queue primaryQueue = new Queue(10);
    Queue secondaryQueue = new Queue(10);

    void push(int element) {
        while (!primaryQueue.isEmpty()) {
            secondaryQueue.enqueue(primaryQueue.dequeue());
        }
        while (!secondaryQueue.isEmpty()) {
            primaryQueue.enqueue(secondaryQueue.dequeue());
        }

    }

    int pop() {
        return primaryQueue.dequeue();
    }

    public static void main(String[] args) {
        StackUsingQueue k = new StackUsingQueue();
        k.push(5);
        k.push(6);
        k.push(7);
        System.out.println(k.pop());
    }
}
