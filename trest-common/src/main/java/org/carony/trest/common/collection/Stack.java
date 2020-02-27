package org.carony.trest.common.collection;

import java.util.Iterator;
import java.util.Objects;

/**
 * Generic stack base on linked list
 *
 * @author Caronyan
 * @date 2020/2/27
 */
public class Stack<T> implements Iterable<T> {

    private int size;
    private Node head;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T data) {
        Node oldHead = head;
        head = new Node();
        head.data = data;
        head.next = oldHead;
        size++;
    }

    public T pop() {
        T t = head.data;
        head = head.next;
        size--;
        return t;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {

        private Node current = head;

        @Override
        public boolean hasNext() {
            return Objects.nonNull(current);
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }

        @Override
        public void remove() {}
    }

    private class Node {
        T data;
        Node next;
    }
}
