public class Queue <T> {

    // Nodes to keep track of current head and tail of the queue
    private Node<T> head;
    private Node<T> tail;

    // amount of Nodes in this chain of Nodes
    private int size;

    /**
     * Creates a new queue
     * @param initialValues the initial values of this queue. First paramter is enqueued first.
     */
    @SafeVarargs
    public Queue (T... initialValues) {
        enqueue(initialValues);
    }

    /**
     * Enqueue a new Object of type T to the end of the queue
     * @param toEnqueue the to be enqueued Object
     */
    public void enqueue (T toEnqueue) {
        Node<T> newNode = new Node<>(toEnqueue);

        if (head == null)
            head = tail = newNode;

        tail.setNext(newNode);
        tail = newNode;

        size++;
    }

    /**
     * Enqueues a variable amount of items
     * @param toEnqueue the values that are to be enqueued. First paramter is enqueued first
     * @see #enqueue(T)
     */
    @SafeVarargs
    public final void enqueue (T... toEnqueue) {
        for (T t: toEnqueue) {
            enqueue(t);
        }
    }

    /**
     * Dequeues and returns the first Object
     * @return the first in line
     */
    public T dequeue () {
        if (isEmpty())
            throw new EmptyQueueException();
        T toReturn = getHead();
        head = head.getNext();
        size--;
        return toReturn;
    }

    /**
     * returns whether this Queue is currently empty
     * @return if this queue is empty
     */
    public boolean isEmpty () {
        return size < 1;
    }

    // Getter

    public T getHead () {
        if (isEmpty())
            throw new EmptyQueueException();
        return head.getRef();
    }

    public T getTail () {
        if (isEmpty())
            throw new EmptyQueueException();
        return tail.getRef();
    }

    public int getSize () {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder nodes = new StringBuilder().append("[");

        for (Node<T> cNode = head; cNode != null; cNode = cNode.getNext())
            nodes.append(cNode.getRef()).append(cNode.getNext() == null ? "" : ", ");

        nodes.append("]");
        return nodes.toString();
    }
}
