package by.andersen.intensive4;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private Object[] array;
    private int size;
    private static final int DEFAULT_LENGTH = 10;

    public MyArrayList() {
        array = new Object[DEFAULT_LENGTH];
    }

    public MyArrayList(int length) {
        array = new Object[length];
    }

    private void grow(int newLength) {
        array = Arrays.copyOf(array, newLength);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public E set(int index, E element) {
        E oldValue = get(index);
        array[index] = element;
        return oldValue;
    }

    @Override
    public boolean add(E e) {
        int oldLength = array.length;
        if (oldLength == size) {
            grow(oldLength * 2);
        }
        array[size] = e;
        size++;
        return true;
    }

    @Override
    public E remove(int index) {
        E oldValue = get(index);
        int newSize = size - 1;
        if (newSize > index) {
            System.arraycopy(array, index + 1, array, index, newSize - index);
        }
        array[size = newSize] = null;
        return oldValue;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }







    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, E element) {


    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
