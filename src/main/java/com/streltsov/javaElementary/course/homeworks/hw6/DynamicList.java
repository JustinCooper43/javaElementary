package com.streltsov.javaElementary.course.homeworks.hw6;

public interface DynamicList {

    boolean add(Object o) ;

    /**
     * removes first occurance
     *
     * @param o Object to remove
     */
    Object removeFirst(Object o) throws NullPointerException;

    Object remove(int index) throws  NullPointerException;

    void removeAll();

    Object replace(int index, Object o) throws  NullPointerException,IndexOutOfBoundsException ;

    Object get(int index) throws IndexOutOfBoundsException;

    boolean addAll( DynamicList list) throws NullPointerException;

    DynamicList sublist(int fromIndex)throws IndexOutOfBoundsException;

    DynamicList sublist(int fromIndex, int toIndex)throws IndexOutOfBoundsException;

    int size();

}
