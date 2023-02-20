import java.util.Queue;

public class MyLinkedList {
    void enqueue(Queue<Integer> queue, int el) {
        queue.add(el);
    }
    int dequeue(Queue<Integer> queue) {
        int num = queue.remove();
        return num;
    }
    int first(Queue<Integer> queue) {
        int num = queue.peek();
        return num;
    }
}