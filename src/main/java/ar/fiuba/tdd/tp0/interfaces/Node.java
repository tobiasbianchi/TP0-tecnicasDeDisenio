package ar.fiuba.tdd.tp0.interfaces;


public interface Node<T> {

    T getValue() throws AssertionError;

    Node<T> next() throws AssertionError;

    Node<T> addLast(T item);

    int amountOfLinkedNodes();

}
