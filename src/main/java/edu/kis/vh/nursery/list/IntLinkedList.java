package edu.kis.vh.nursery.list;

/**
 * @author karolina
 * Class create linked list
 */
public class IntLinkedList {

    /**
     * Class which create new node for linked list
     */
    public static class Node {

        /**
         * @param value is value of node
         * @param prev is a previous node of current node or null if current node is first one in a linked list
         * @param next is a next node of current node or null if current node is last one in a linked list
         */
        private final int value;
        private Node prev;
        private Node next;

        /**
         * @param i is the value of node
         */
        public Node(int i) {
            this.value = i;
        }

        /**
         * @return value of node
         */
        public int getValue() {
            return value;
        }

        /**
         * @return previous element of node or null if node is first one in linked list
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * @param prev is previous node of current node
         *             class set new previous node
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * @return next element of node or null if node is last one in linked list
         */
        public Node getNext() {
            return next;
        }

        /**
         * @param next is next node of current
         *             class set new next node
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }

    /**
     * @param last is the last node of the linked list
     * @param i is the value of last node
     */
    private Node last;
    private int i;

    /**
     * Method adds new node to the list
     */
    public void push(int i) {
        if (last == null) last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return true if list is empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return false always
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return -1 if list is empty
     * or value of the last element
     */
    public int top() {
        if (isEmpty()) return -1;
        return last.getValue();
    }

    /**
     * @return -1 if list is empty
     * or value of the last element of the list
     * and set last as penultimate node of the list
     */
    public int pop() {
        if (isEmpty()) return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
