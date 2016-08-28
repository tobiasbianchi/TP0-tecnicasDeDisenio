package ar.fiuba.tdd.tp0;

public class Cola<T> implements  Queue<T> {
    private Nodo top;
    private int size;

    public Cola() {
        size = 0;
        top = new Nodo();
    }

    public boolean isEmpty() {
        return top.isEmpty();
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        if ( top.isEmpty() ) {
            top.setValue(item);
        } else {
            top.getLastLinkedNode().addNext(item);
        }
        size++;
    }

    public T top() throws AssertionError {
        return ( T )top.getValue();
    }

    public void remove() throws AssertionError {
        top = top.next();
        size--;
    }
}
