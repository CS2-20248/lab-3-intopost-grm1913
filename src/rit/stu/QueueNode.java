package rit.stu;

import rit.cs.Node;
import rit.cs.Queue;

/**
 * A queue implementation that uses a Node to represent the structure.
 *
 * @param <T> The type of data the queue will hold
 * @author RIT CS
 */
public class QueueNode<T> implements Queue<T> {
    /**
     * Create an empty queue.
     */
    private static class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) { this.data = data; this.next = null;}
    }

    private Node<T> front;
    private Node<T> back;

    public QueueNode() {
        this.front = null;
        this.back = null;
    }

    @Override
    public T back(
    ) {
        assert !empty();
        return back.data;
    }

    @Override
    public T dequeue() {
        assert !empty();
        T value = front.data;
        front = front.next;
        if(front == null){ back = null;}
        return value;
    }

    @Override
    public boolean empty() { return front == null;

    }

    @Override
    public void enqueue(T element) { Node<T> node = new Node<>(element);
        if (empty()) {front = node; back = node;}
        else {back.next = node;
        back = node;}
    }

    @Override
    public T front() {
        assert !empty();
        return front.data;
    }
}
