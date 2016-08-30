package ar.fiuba.tdd.tp0.Nodes;

import ar.fiuba.tdd.tp0.Nodes.BasicNode;
import ar.fiuba.tdd.tp0.interfaces.Node;

public class EmptyNode implements Node {

    public Object getValue() throws AssertionError {
        throw new AssertionError();
    }

    public BasicNode next() throws AssertionError {
        throw new AssertionError();
    }

    public Node addLast(Object item) {
        return new BasicNode(item);
    }

    public int amountOfLinkedNodes(){
        return 0;
    }
}
