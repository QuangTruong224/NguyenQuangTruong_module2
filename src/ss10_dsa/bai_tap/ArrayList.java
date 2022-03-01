package ss10_dsa.bai_tap;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int Default_Capacity = 10;
    Object elements[];

    public ArrayList() {
        elements = new Object[Default_Capacity];
    }

    public ArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }
    public int getSize() {
        return this.size;
    }
    public void clear() {
        size = 0;
        for (Object i : elements) {
            i = null;
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newCapacity = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        } else {
            throw new IllegalArgumentException("Capacity: " + minCapacity);
        }
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(1);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }
    public E get(int index) {
        return (E) elements[index];
    }


    public int indextOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }


    public boolean contain(E element) {
        return this.indextOf(element) >= 0;
    }

    public ArrayList<E> clone() {
        ArrayList<E> clone = new ArrayList<>();
        clone.elements = Arrays.copyOf(this.elements, this.size);
        clone.size = this.size;
        return clone;
    }


    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
