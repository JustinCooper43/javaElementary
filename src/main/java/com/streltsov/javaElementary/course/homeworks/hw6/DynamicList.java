package com.streltsov.javaElementary.course.homeworks.hw6;

public interface DynamicList {

    boolean add(Object o);

    /**
     * removes first occurance
     *
     * @param o Object to remove
     */
    boolean removeFirst(Object o);

    Object remove(int index)throws IndexOutOfBoundsException;

    void removeAll();

    Object replace(int index, Object o) throws IndexOutOfBoundsException;

    Object get(int index) throws IndexOutOfBoundsException;

    boolean addAll(DynamicList list) throws NullPointerException;

    DynamicList sublist(int fromIndex) throws IndexOutOfBoundsException;

    DynamicList sublist(int fromIndex, int toIndex) throws IndexOutOfBoundsException;

    int size();

}
