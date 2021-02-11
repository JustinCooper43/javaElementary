package com.streltsov.javaElementary.course.homeworks.hw6;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray implements DynamicList {

    private Object[] coreArray = new Object[10];
    private int index = 0;
    private final long milestone = Math.round(coreArray.length * 0.75);


    public DynamicArray() {
    }

    public DynamicArray(Object[] coreArray) {
        this.coreArray = coreArray;
        this.index = coreArray.length;
    }


    @Override
    public boolean add(Object o) {
        if (milestone == index) {
            scaleCoreArray();
        }
        coreArray[index] = o;
        index++;
        return true;
    }

    @Override
    public boolean removeFirst(Object o) {

        for (int i = 0; i < index; i++) {
            if (Objects.equals(coreArray[i],o)) {
                System.arraycopy(coreArray, i + 1, coreArray, i, index - i - 1);
                index--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {

        checkValidOfIndex(index);

        Object removeObject = coreArray[index];
        System.arraycopy(coreArray, index + 1, coreArray, index, this.index - index - 1);
        this.index--;

        return removeObject;
    }


    @Override
    public void removeAll() {
        for(int i = 0; i < size() - 1; i++){
            coreArray[i] = null;
        }
        coreArray = new Object[10];
        this.index = 0;
    }

    @Override
    public Object replace(int index, Object o) {
        checkValidOfIndex(index);
            Object tmp = coreArray[index];
            coreArray[index] = o;
            return tmp;
    }

    @Override
    public Object get(int index) {
        checkValidOfIndex(index);
        return coreArray[index];
    }

    @Override
    public boolean addAll(DynamicList list) {

        if (list == null) {
            throw new NullPointerException();
        }

        int newSizeOfArray = index + list.size()-1;

        coreArray = Arrays.copyOf(coreArray, newSizeOfArray);
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
        this.index = newSizeOfArray;
        return true;
    }

    @Override
    public DynamicList sublist(int fromIndex) {
        checkValidOfIndex(fromIndex);
        return sublist(fromIndex,size() - 1);
    }

    @Override
    public DynamicList sublist(int fromIndex, int toIndex) {

        checkValidOfIndex(fromIndex);
        checkValidOfIndex(toIndex);

        int lengthSubArray = toIndex - fromIndex;

        Object[] internalArrayForSublist = new Object[lengthSubArray];

        System.arraycopy(coreArray, fromIndex, internalArrayForSublist, 0, lengthSubArray);

        return new DynamicArray(internalArrayForSublist);
    }

    @Override
    public int size() {
        return this.index + 1;
    }

    private void scaleCoreArray() {
        int coreArrayCapacity = this.index;
        int capacityCalculate = 2;
        int desireArrayCapacity = coreArrayCapacity * capacityCalculate;
        coreArray = Arrays.copyOf(coreArray, desireArrayCapacity);
    }

    void checkValidOfIndex(int index) {
        if (index > this.index && index <= 0) {
            throw new IndexOutOfBoundsException("Index is not in the valid range ( available : 0 - " + this.index + " )");
        }
    }

    @Override
    public String toString() {

        if (index == 0) {
            return "Array is empty";
        }

        StringBuilder build = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                build.append(coreArray[i]).append("]");
            } else {
                build.append(coreArray[i]).append(", ");
            }
        }

        return build.toString();
    }


}
