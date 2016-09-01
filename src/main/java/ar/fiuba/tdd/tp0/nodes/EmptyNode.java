package ar.fiuba.tdd.tp0.nodes;

import ar.fiuba.tdd.tp0.interfaces.Node;

public class EmptyNode<T> implements Node<T> {

    public T getValue() {
        throw new AssertionError();
    }

    public Node<T> next() {
        throw new AssertionError();
    }

    public Node<T> addLast(T item) {
        return new BasicNode<>(item);
    }

    public int amountOfLinkedNodes() {
        return 0;
    }
}
