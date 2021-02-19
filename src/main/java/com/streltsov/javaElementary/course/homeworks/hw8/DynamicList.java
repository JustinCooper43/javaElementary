package com.streltsov.javaElementary.course.homeworks.hw8;

public interface DynamicList <T> {

    boolean add(T o);

    /**
     * removes first occurance
     *
     * @param o Object to remove
     */
    boolean removeFirst(T o);

    T remove(int index)throws IndexOutOfBoundsException;

    void removeAll();

    T replace(int index, T o) throws IndexOutOfBoundsException;

    T get(int index) throws IndexOutOfBoundsException;

    boolean addAll(DynamicList<T> list) throws NullPointerException;

    DynamicList<T> sublist(int fromIndex) throws IndexOutOfBoundsException;

    DynamicList<T> sublist(int fromIndex, int toIndex) throws IndexOutOfBoundsException;

    int size();

}
