package ar.fiuba.tdd.tp0.nodes;

import ar.fiuba.tdd.tp0.interfaces.Node;

class BasicNode<T> implements Node<T> {
    private T value;
    private Node<T> next;

    BasicNode(T item) {
        this.value = item;
        this.next = new EmptyNode<>();
    }

    public T getValue() {
        return value;
    }

    public Node<T> next()  {
        return next;
    }

    public Node<T> addLast(T item) {
        next = next.addLast(item);
        return this;
    }

    public int amountOfLinkedNodes() {
        return 1 + next.amountOfLinkedNodes();
    }

}
