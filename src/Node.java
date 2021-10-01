public class Node <T> {

    // Next node referring to the next item in the Queue
    private Node<T> next;

    // The Object this Node points to
    private final T reference;

    /**
     * Basic constructor that just takes a reference as input.
     * No {@code next} Node needs to be specified as for a queue that Node will at first always be {@code null}
     * @param reference the Object this Node points to
     */
    public Node(T reference) {
        this.reference = reference;
    }

    /**
     * gets the next node specified by the {@code next} Node
     * @return the node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * returns the Object this Node points to
     * @return the reference
     */
    public T getRef() {
        return reference;
    }

    /**
     * Sets the Next node
     * @param next the next Node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return reference.toString();
    }
}
