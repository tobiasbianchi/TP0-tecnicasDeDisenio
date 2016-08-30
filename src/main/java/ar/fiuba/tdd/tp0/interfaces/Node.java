package ar.fiuba.tdd.tp0.interfaces;


public interface Node {

    public Object getValue() throws AssertionError;

    public Node next() throws AssertionError;

    public Node addLast(Object item);

    public int amountOfLinkedNodes();

}
