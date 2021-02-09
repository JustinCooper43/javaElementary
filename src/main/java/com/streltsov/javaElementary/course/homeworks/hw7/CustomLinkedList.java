package com.streltsov.javaElementary.course.homeworks.hw7;

import com.streltsov.javaElementary.course.homeworks.hw6.DynamicList;

public class CustomLinkedList implements DynamicList {

    int size = 0;

    Node head = null;
    Node tail = null;
    
    @Override
    public boolean add(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        if (size == 0) {
            return initHead(o);
        }
        Node tmp = tail;
        tail = new Node(o);
        if (tmp != null) {
            tmp.next = tail;
            tail.prev = tmp;
        } else {
            head.next = tail;
            tail.prev = head;
        }
        size++;
        return true;
    }
    
    private static class Node {

        Node prev;
        Node next;
        Object element;

        public Node(Object element) {
            this.element = element;

        }

        private boolean hasNext() {
            return next != null;
        }

        private boolean hasPrev() {
            return prev != null;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    private boolean initHead(Object o) {
        head = new Node(o);
        size++;
        return true;
    }
    
    @Override
    public Object removeFirst(Object o) {

        if (o == null) {
            throw new NullPointerException();
        }

        Node removeObject = head;

        if (head.element.equals(o)) {
            this.head = removeObject.next;
            size--;
            return removeObject.element;
        }

        if (tail.element.equals(o) & removeObject == tail) {
            this.tail = removeObject.prev;
            size--;
            return removeObject.element;
        }

        for (int i = 0; i < size; i++){

            if (removeObject.element.equals(o)) {
                return findObject(i).element;
            }
            removeObject = removeObject.next;
        }
        return null;
    }

    @Override
    public Object remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return findObject(index).element;
    }

    private Node findObject(int indexPlace) {

        Node soughtNode = head;

        if (indexPlace == 0) {
            this.head = soughtNode.next;
            size--;
            return soughtNode;
        } else if (indexPlace == size - 1) {
            this.tail = soughtNode.prev;
            size--;
            return soughtNode;
        }
        for (int i = 0; i < indexPlace; i++) {
            soughtNode = soughtNode.next;
        }
        soughtNode.prev.next = soughtNode.next;
        soughtNode.next.prev = soughtNode.prev;
        size--;
        return soughtNode;
    }

    @Override
    public void removeAll() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    @Override
    public Object replace(int index, Object o) {

        if (o == null) {
            throw new NullPointerException();
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node replaceNode = findObject(index);

        Object result = replaceNode.element;
        replaceNode.element = o;
        return result;
    }

    @Override
    public Object get(int index) {
        
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return findObject(index).element;
    }

    @Override
    public boolean addAll(DynamicList list) {

        if (list == null) {
            throw new NullPointerException();
        }

        for (int i = 0; i < list.size(); i++) {
            if (size == 0) {
                return initHead(list.get(i));
            }
            Node nodeTail = head;
            for(int k = 0; k < size - 1; k++) {
                nodeTail = nodeTail.next;
            }
            tail = nodeTail;
            Node tmp = tail;
            tail = new Node(list.get(i));
            if (tmp != null) {
                tmp.next = tail;
                tail.prev = tmp;
            } else {
                head.next = tail;
                tail.prev = head;
            }
            size++;
        }
        return true;
    }

    @Override
    public DynamicList sublist(int fromIndex) {

        if (fromIndex < 0 || fromIndex >= size) {
            throw new IndexOutOfBoundsException();
        }
        DynamicList subList = new CustomLinkedList();
        Node listElement = head;

        for (int i = 0; i < size; i++) {
            if (i >= fromIndex) {
                subList.add(listElement);
            }
            listElement = listElement.next;
        }
        return subList;
    }

    @Override
    public DynamicList sublist(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= size ||
                toIndex < 0 || toIndex >= size ||
                fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        DynamicList subList = new CustomLinkedList();
        Node listElement = head;

        for (int i = 0; i < toIndex; i++) {
            if (i >= fromIndex) {
                subList.add(listElement);
            }
            listElement = listElement.next;
        }
        return subList;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String systemLineSeparator = System.lineSeparator();
        builder.append("CustomLinkedList of size: ").append(size).append(".").append(systemLineSeparator);
        if (size > 0) {
            Node current = head;
            int i = 0;
            while (i < size) {
                builder.append(current.toString()).append(systemLineSeparator);
                current = current.next;
                i++;
            }
        }
        return builder.toString();
    }


}
