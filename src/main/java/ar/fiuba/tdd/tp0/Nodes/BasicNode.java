package ar.fiuba.tdd.tp0;

public class BasicNode implements Node{
    private Object value;
    private Node next;

    public BasicNode(Object item) {
        this.value = item;
        this.next = new EmptyNode();
    }

    public BasicNode() {
        this(null);
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean hasNext() {
        return !next.isEmpty();
    }

    public Object getValue() throws AssertionError {
        return value;
    }

    public Node next() throws AssertionError {
        return next;
    }

    public void addLast(Object item) {
        next = new BasicNode( item );
    }

    public int amountOfLinkedNodes(){
        return 1 + next.amountOfLinkedNodes();
    }

}
