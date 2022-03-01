package ss11_stack_queue.thuc_hanh.trien_khai_queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue=new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(30);
        System.out.println("Deque is temp:" + queue.dequeue().key);
    }
}
