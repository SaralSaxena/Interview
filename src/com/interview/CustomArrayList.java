package com.interview;

import java.util.Arrays;

class CustomArrayList<G> {

    private static final int INITIAL_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;


    public CustomArrayList() {
        elementData = new Object[INITIAL_CAPACITY];
    }


    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }


    public void add(G e) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = e;
    }


    @SuppressWarnings("unchecked")
    public G get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (G) elementData[index];
    }


    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }

        Object removedElement = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;   //reduce size of ArrayListCustom after removal of element.
        return removedElement;
    }


    /**
     * method displays all the elements in list.
     */
    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
    }

}