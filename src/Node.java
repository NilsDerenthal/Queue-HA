public class Node <T> {

    private Node<T> next;
    private final T reference;

    public Node(T reference) {
        this.reference = reference;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getRef() {
        return reference;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return reference.toString();
    }
}
