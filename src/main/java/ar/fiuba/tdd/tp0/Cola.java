package ar.fiuba.tdd.tp0;

import ar.fiuba.tdd.tp0.Nodes.EmptyNode;
import ar.fiuba.tdd.tp0.interfaces.Node;
import ar.fiuba.tdd.tp0.interfaces.Queue;

public class Cola<T> implements Queue<T> {
    private Node top;

    public Cola() {
        top = new EmptyNode();
    }

    public int size() {
        return top.amountOfLinkedNodes();
    }

    public boolean isEmpty() {
        return ( size() == 0 );
    }

    public void add(T item) {
        top = top.addLast(item);
    }

    public T top() throws AssertionError {
        return ( T )top.getValue();
    }

    public void remove() throws AssertionError {
        top = top.next();
    }
}
