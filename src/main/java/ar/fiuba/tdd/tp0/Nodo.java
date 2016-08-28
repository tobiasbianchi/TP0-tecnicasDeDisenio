package ar.fiuba.tdd.tp0;

/**
 * Created by tobias on 27/08/16.
 */
public class Nodo {
    private Object value;
    private Nodo next;

    public Nodo() {
        this.value = null;
        this.next = null;
    }

    public Nodo(Object item) {
        this.value = item;
        this.next = null;
    }

    private boolean isNull(Object element) {
        return ( element == null );
    }

    private Object getValid(Object element) throws AssertionError {
        if ( isNull(element) ) {
            throw new AssertionError();
        }
        return element;
    }

    public void setValue(Object actual) {
        this.value = actual;
    }

    public boolean isEmpty() {
        return isNull( value );
    }

    public boolean hasNext() {
        return !isNull( next );
    }

    public Object getValue() throws AssertionError {
        return getValid( value );
    }

    public Nodo next() throws AssertionError {
        return ( Nodo )getValid( next );
    }

    public Nodo getLastLinkedNode() {
        Nodo last = this;
        while ( last.hasNext() ) {
            last = last.next;
        }
        return last;
    }

    public void addNext(Object item) {
        next = new Nodo( item );
    }

}
