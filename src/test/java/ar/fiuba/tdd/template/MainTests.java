package ar.fiuba.tdd.template;

import ar.fiuba.tdd.tp0.Cola;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTests {

    @Test
    public void dummy() {
        assertEquals(0, 0);
    }

    @Test(expected = AssertionError.class)
    public void removeElementInEmptyColaThrowsException() {
        Cola<String> cola = new Cola<>();
        cola.remove();
    }

    @Test(expected = AssertionError.class)
    public void getTopElementInEmptyColaThrowsException() {
        Cola<String> cola = new Cola<>();
        cola.top();
    }

    @Test
    public void initialColaIsEmpty() {
        Cola<String> cola = new Cola<>();
        assertTrue(cola.isEmpty());
    }

    @Test
    public void addItemColaIsNotEmpty() {
        Cola<Integer> cola = new Cola<>();
        cola.add(4);
        assertTrue(!cola.isEmpty());
    }

    @Test
    public void addItemColaReturnsSameValue() {
        Cola<Integer> cola = new Cola<>();
        Integer value = 4;
        cola.add(value);
        assertEquals(value,cola.top());
    }

    private void addRepetitiveElement(Cola<Integer> cola, Integer value, Integer amount) {
        for (int i = 0; i < amount; i++) {
            cola.add(value);
        }
    }

    @Test
    public void addVariousItemsColaReturnsTopValue() {
        Cola<Integer> cola = new Cola<>();
        Integer topValue = 4;
        cola.add(topValue);
        addRepetitiveElement(cola, 5,5);
        assertEquals(topValue,cola.top());
    }

    @Test
    public void addVariousItemsColaHasCorrectSize() {
        Cola<Integer> cola = new Cola<>();
        int sizeCola = 4;
        addRepetitiveElement(cola, 5, sizeCola);
        assertEquals(sizeCola,cola.size());
    }

    @Test
    public void addVariousItemsRemoveOneColaHasCorrectSize() {
        Cola<Integer> cola = new Cola<>();
        int sizeCola = 4;
        addRepetitiveElement(cola, 5, sizeCola);
        cola.remove();
        assertEquals(sizeCola - 1,cola.size());
    }
}
