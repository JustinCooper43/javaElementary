package com.streltsov.javaElementary.course.homeworks.hw6;

public interface DynamicList {

    boolean add(Object o);

    /**
     * removes first occurance
     *
     * @param o Object to remove
     */
    Object removeFirst(Object o);

    Object remove(int index);

    void removeAll();

    Object replace(int index, Object o);

    Object get(int index);

    boolean addAll(DynamicList list);

    DynamicList sublist(int fromIndex);

    DynamicList sublist(int fromIndex, int toIndex);

    int size();

}
