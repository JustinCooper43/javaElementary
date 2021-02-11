package com.streltsov.javaElementary.course.homeworks.hw7;

import com.streltsov.javaElementary.course.homeworks.hw6.DynamicList;

import java.util.Objects;

public class CustomLinkedList implements DynamicList {

    int size = 0;

    Node head = null;
    Node tail = null;

    @Override
    public boolean add(Object o) {
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
    public boolean removeFirst(Object o) {

        Node removeObject = head;

        if (Objects.equals(removeObject.element, o)) {
            this.head = removeObject.next;
            head.prev = null;
            size--;
            return true;
        }
        for (int i = 1; i < size - 1; i++) {
            if (Objects.equals(removeObject.element, o)) {
                redirectNode(removeObject);
                return true;
            }
            removeObject = removeObject.next;
        }
        if (Objects.equals(removeObject.element, o)) {
            this.tail = removeObject.prev;
            tail.prev = null;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        checkOfBounds(index);
        return removeByIndex(index).element;
    }

    private Node removeByIndex(int indexPlace) {

        Node currentNode = head;

        if (indexPlace == 0) {
            this.head = currentNode.next;
            head.prev = null;
            size--;
            return currentNode;
        } else if (indexPlace == size - 1) {
            this.tail = currentNode.prev;
            tail.prev = null;
            size--;
            return currentNode;
        }
        if (indexPlace <= size / 2) {
            for (int i = 1; i <= indexPlace; i++) {
                currentNode = currentNode.next;
            }
            redirectNode(currentNode);
        } else {
            currentNode = tail;
            for (int i = size - 2; i >= indexPlace; i--) {
                currentNode = currentNode.prev;
            }
            redirectNode(currentNode);
            return currentNode;
        }
        return currentNode;
    }

    private void redirectNode(Node currentNode) {
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        size--;
    }

    @Override
    public void removeAll() {
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            currentNode.element = null;
            currentNode.prev = null;
            currentNode = currentNode.next;
        }
        size = 0;
    }

    @Override
    public Object replace(int index, Object o) {
        checkOfBounds(index);

        Node replaceNode = findNode(index);
        Object result = replaceNode.element;
        replaceNode.element = o;
        return result;
    }

    @Override
    public Object get(int index) {
        checkOfBounds(index);
        return findNode(index).element;
    }

    private Node findNode (int indexNumber){
        Node getNode = head;
        for (int i = 0; i <= indexNumber; i++) {
            getNode = getNode.next;
        }
        return getNode;
    }

    @Override
    public boolean addAll(DynamicList list) {
        if (list == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < list.size() - 1; i++) {
            add(list.get(i));
        }
        return true;
    }


    @Override
    public DynamicList sublist(int fromIndex) {
        checkOfBounds(fromIndex);
        return sublist(fromIndex, size() - 1);
    }

    @Override
    public DynamicList sublist(int fromIndex, int toIndex) {
        checkOfBounds(fromIndex, toIndex);

        DynamicList subList = new CustomLinkedList();
        Node listElement = head;

        for (int i = 0; i < toIndex; i++) {
            if (i >= fromIndex) {
                subList.add(listElement.element);
            }
            listElement = listElement.next;
        }
        return subList;
    }

    private void checkOfBounds(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void checkOfBounds(int fromIndex, int toIndex) throws IndexOutOfBoundsException, IllegalArgumentException {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        checkOfBounds(fromIndex);
        checkOfBounds(toIndex);
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
