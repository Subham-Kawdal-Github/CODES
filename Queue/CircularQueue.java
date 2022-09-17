
class CircularQueu {
    int data[];
    int front;
    int rear;

    CircularQueu(int capacity) {
        data = new int[capacity];
        front = rear = 0;
    }

    void equeue(int element) {
        if (data.length == rear) {
            throw new RuntimeException("Circular queue is full");
        }
        int index = (front + rear) % data.length;
        data[index] = element;
        rear++;
    }

    int dequeue() {
        if (rear == 0) {
            throw new RuntimeException("Queue is Empty");
        }
        int element = data[front];
        data[front] = 0;
        front = front + 1;
        rear--;
        return element;
    }

    void print() {
        for (int i = 0; i < rear; i++) {
            int index = (front + i) % data.length;
            System.out.println(data[index]);
        }
    }
}

public class CircularQueue {

    public static void main(String[] args) {
        CircularQueu cq = new CircularQueu(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.print();
        cq.dequeue();
        cq.dequeue();

    }
}
