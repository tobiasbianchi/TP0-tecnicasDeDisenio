package ar.fiuba.tdd.tp0;

/**
 * Created by tobias on 27/08/16.
 */
public interface Queue<T> {

    boolean isEmpty();

    int size();

    void add(T item);

    T top() throws AssertionError;

    void remove() throws AssertionError;
}
