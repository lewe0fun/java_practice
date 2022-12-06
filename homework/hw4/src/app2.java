//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue()
// - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class app2 {
    public static void main(String[] args) {
        LinkedList<Object> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            enqueue(queue, i + 1);
        System.out.println(queue);
        System.out.println(dequeue(queue));
        System.out.println(queue);
        System.out.println(first(queue));
    }

    public static void enqueue(LinkedList<Object> queue, Object o) {
        queue.addLast(o);
    }

    public static Object dequeue(LinkedList<Object> queue) {
        return queue.removeFirst();
    }

    public static Object first(LinkedList<Object> queue) {
        return queue.getFirst();
    }
}

