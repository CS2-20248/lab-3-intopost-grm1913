package rit.stu;

import rit.cs.Stack;

/**
 * A stack implementation that uses a Node to represent the structure.
 *
 * @param <T> The type of data the stack will hold
 * @author Gabriella Moon
 */
public class StackNode<T> implements Stack<T> {

    /**
     * Create an empty stack.
     */
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> top;

    public StackNode() {
        this.top = null;
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public T pop() {
        assert !empty();
        T value = top.data;
        top = top.next;
        return value;
    }

    @Override
    public void push(T element) {
        top = new Node<>(element, top);
    }

    @Override
    public T top() {

        assert !empty();
        return top.data;
    }
}
