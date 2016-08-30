package ar.fiuba.tdd.tp0.Nodes;

import ar.fiuba.tdd.tp0.interfaces.Node;

public class BasicNode implements Node {
    private Object value;
    private Node next;

    public BasicNode(Object item) {
        this.value = item;
        this.next = new EmptyNode();
    }

    public Object getValue() throws AssertionError {
        return value;
    }

    public Node next() throws AssertionError {
        return next;
    }

    public Node addLast(Object item) {
        next = next.addLast(item);
        return this;
    }

    public int amountOfLinkedNodes(){
        return 1 + next.amountOfLinkedNodes();
    }

}
