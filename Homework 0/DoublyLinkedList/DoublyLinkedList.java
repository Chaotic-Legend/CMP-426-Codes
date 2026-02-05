// CMP 426: Operating Systems - Homework 0 - Isaac D. Hoyos

public class DoublyLinkedList<I extends java.lang.Comparable<? super I>>
        implements ListInterface<I> {

    // This field stores the reference to the head of the list.
    private LinkedListNode<I> head;

    // This field stores the reference to the tail of the list.
    private LinkedListNode<I> tail;

    // This field stores the number of elements in the list.
    private int size;

    // This constructor initializes the doubly linked list as empty.
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // This method adds an element to the end of the list.
    @Override
    public void add(I element) {
        LinkedListNode<I> newNode = new LinkedListNode<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
    }

    // This method adds an element at the specified index.
    @Override
    public void add(I element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        LinkedListNode<I> newNode = new LinkedListNode<>(element);
        if (index == 0) {
            newNode.setNext(head);
            if (head != null) head.setPrevious(newNode);
            head = newNode;
            if (tail == null) tail = newNode;
        } else if (index == size) {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        } else {
            LinkedListNode<I> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            newNode.setNext(current);
            newNode.setPrevious(current.getPrevious());
            current.getPrevious().setNext(newNode);
            current.setPrevious(newNode);
        }
        size++;
    }

    // This method adds an element in sorted order.
    @Override
    public void addSorted(I element) {
        LinkedListNode<I> newNode = new LinkedListNode<>(element);
        if (head == null || element.compareTo(head.getElement()) <= 0) {
            add(element, 0);
            return;
        }
        LinkedListNode<I> current = head;
        int index = 0;
        while (current != null && element.compareTo(current.getElement()) > 0) {
            current = current.getNext();
            index++;
        }
        add(element, index);
    }

    // This method returns a copy of the list.
    @Override
    public ListInterface<I> copy() {
        DoublyLinkedList<I> newList = new DoublyLinkedList<>();
        LinkedListNode<I> current = head;
        while (current != null) {
            newList.add(current.getElement());
            current = current.getNext();
        }
        return newList;
    }

    // This method returns the element at the specified index.
    @Override
    public I get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        LinkedListNode<I> current = head;
        for (int i = 0; i < index; i++) current = current.getNext();
        return current.getElement();
    }

    // This method returns true if the list is empty.
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // This method removes and returns the element at the specified index.
    @Override
    public I remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        LinkedListNode<I> removed;
        if (index == 0) {
            removed = head;
            head = head.getNext();
            if (head != null) head.setPrevious(null);
            if (head == null) tail = null;
        } else if (index == size - 1) {
            removed = tail;
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            LinkedListNode<I> current = head;
            for (int i = 0; i < index; i++) current = current.getNext();
            removed = current;
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
        }
        size--;
        return removed.getElement();
    }

    // This method removes all elements from the list.
    @Override
    public void removeAll() {
        head = tail = null;
        size = 0;
    }

    // This method replaces and returns the element at the specified index.
    @Override
    public I replace(I element, int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        LinkedListNode<I> current = head;
        for (int i = 0; i < index; i++) current = current.getNext();
        I old = current.getElement();
        current.setElement(element);
        return old;
    }

    // This method returns the number of elements in the list.
    @Override
    public int size() {
        return size;
    }

    // This method prints all elements in the list from head to tail.
    public void showList() {
        LinkedListNode<I> current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // This method prints all elements in the list from tail to head.
    public void showListReverse() {
        LinkedListNode<I> current = tail;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getPrevious();
        }
        System.out.println();
    }

    // Main method for simple testing.
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
