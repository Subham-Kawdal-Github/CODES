class Queue {
    int data[]; // Queue values
    int front;
    int rear;
    int size;

    Queue(int capacity) {
        data = new int[capacity];
        front = rear = -1;
        size = 0; // queue empty a start
    }

    // Insertion in Queue made by Array
    void enqueue(int element) {
        // Queue is full
        if (size == data.length) {
            throw new RuntimeException("Queue is full");
        }
        // is queue empty
        if (size == 0) {
            front = 0;
        }
        rear++;
        size++;
        if (rear == data.length) {
            rear = 0;
        }
        data[rear] = element;
    }

    // Delete Operation in Queue
    int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Empty ");
        }
        int frontElement = data[front];
        front++;// front move to next element

        if (front == data.length) {
            front = 0;
        }
        size--;
        if (size == 0) {
            front = rear = -1;
        }
        return frontElement;
    }

    int getSize() {
        return size;
    }

    int getFront() {
        if (getSize() == 0) {
            throw new RuntimeException("No Front Queue is Empty");
        }
        return data[front];
    }

    int getRear() {
        if (getSize() == 0) {
            throw new RuntimeException("No Rear Queue is Empty");
        }
        return data[rear];
    }

    boolean isEmpty() {
        return size == 0;
    }
}

public class QueueArray {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.getFront());
    }
}
