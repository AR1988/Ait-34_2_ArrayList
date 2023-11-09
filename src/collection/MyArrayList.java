package collection;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 09.11.2023
 */
public class MyArrayList<E> implements MyList<E> {

    private Object[] source;
    private int size;

    public MyArrayList() {
        source = new Object[16];
    }

    public MyArrayList(int capacity) {
        source = new Object[capacity];
    }

    @Override
    public void add(E o) {
        if (size == source.length) {
            // увеличивать массив в 1,5 раза от текущего размера
            int newSize = source.length + (source.length / 2);
            source = Arrays.copyOf(source, newSize);
        }

        source[size++] = o;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) source[index];
    }

    @Override
    public void set(E o, int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    @Override
    public E removeByIndex(int index) {
        return null;
    }
}
