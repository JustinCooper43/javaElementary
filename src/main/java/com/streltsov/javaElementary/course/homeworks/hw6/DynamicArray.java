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
        if (o == null) {
            throw new NullPointerException();
        }
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
                if (Objects.equals(coreArray[i], o)) {
                    System.arraycopy(coreArray, i + 1, coreArray, i, index - i - 1);
                    index--;
                    return true;
                }
            }
        return false;

    }

    @Override
    public Object remove(int index) {

        Object removeObject = coreArray[index];

        if (checkValidOfIndex(index)) {


            System.arraycopy(coreArray, index + 1, coreArray, index, this.index - index - 1);
            this.index--;
        }
        return removeObject;
    }


    @Override
    public void removeAll() {
        coreArray = new Object[10];
        this.index = 0;
    }

    @Override
    public Object replace(int index, Object o) {
        if(o == null){
            throw new NullPointerException();
        }
        if (checkValidOfIndex(index)) {
            Object tmp = coreArray[index];
            coreArray[index] = o;
            return tmp;
        }
        return null;
    }

    @Override
    public Object get(int index) {
        if (checkValidOfIndex(index)) {
            return coreArray[index];
        }
        return null;
    }

    public boolean addAll(DynamicList list) {

        if (list == null) {
            throw new NullPointerException();
        }
        int i, k;
        int newSizeOfArray = index + list.size();

        coreArray = Arrays.copyOf(coreArray, newSizeOfArray + 1);
        for (i = index, k = 0; i < newSizeOfArray; i++, k++) {
            coreArray[i] = list.get(k);
            index++;
        }
        return true;
    }

    @Override
    public DynamicList sublist(int fromIndex) {
        if (checkValidOfIndex(fromIndex)) {

            Object[] subArray = new Object[index - fromIndex];
            System.arraycopy(coreArray, fromIndex, subArray, 0, index - fromIndex);
            return new DynamicArray(subArray);
        }
        return null;
    }

    @Override
    public DynamicList sublist(int fromIndex, int toIndex) {

        if (checkValidOfIndex(fromIndex) & checkValidOfIndex(toIndex)) {

            Object[] internalArrayForSublist = new Object[toIndex - fromIndex];
            System.arraycopy(coreArray, fromIndex, internalArrayForSublist, 0, toIndex - fromIndex);
            return new DynamicArray(internalArrayForSublist);
        }
        return null;
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

    boolean checkValidOfIndex(int index) {

        if (index < this.index && index >= 0) {
            return true;
        }
        throw new IndexOutOfBoundsException("Index is not in the valid range ( available : 0 - " + this.index + " )");
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
