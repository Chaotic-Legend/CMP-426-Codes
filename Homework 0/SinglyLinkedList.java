// CMP 426: Operating Systems - Homework 0 - Isaac D. Hoyos

public class SinglyLinkedList<I extends java.lang.Comparable<? super I>>
        implements ListInterface<I> {

    // This field stores the reference to the head of the list.
    private LinkedListNode<I> head;

    // This field stores the number of elements in the list.
    private int size;

    // This constructor initializes the list as empty.
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    // This method adds an element to the end of the list.
    @Override
    public void add(I element) {
        LinkedListNode<I> newNode = new LinkedListNode<>(element);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode<I> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
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
            head = newNode;
        } else {
            LinkedListNode<I> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    // This method adds an element in sorted order.
    @Override
    public void addSorted(I element) {
        LinkedListNode<I> newNode = new LinkedListNode<>(element);
        if (head == null || element.compareTo(head.getElement()) <= 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            LinkedListNode<I> current = head;
            while (current.getNext() != null &&
                   element.compareTo(current.getNext().getElement()) > 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    // This method returns a copy of the list.
    @Override
    public ListInterface<I> copy() {
        SinglyLinkedList<I> newList = new SinglyLinkedList<>();
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        LinkedListNode<I> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        I removedElement;
        if (index == 0) {
            removedElement = head.getElement();
            head = head.getNext();
        } else {
            LinkedListNode<I> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            removedElement = current.getNext().getElement();
            current.setNext(current.getNext().getNext());
        }
        size--;
        return removedElement;
    }

    // This method removes all elements from the list.
    @Override
    public void removeAll() {
        head = null;
        size = 0;
    }

    // This method replaces and returns the element at the specified index.
    @Override
    public I replace(I element, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        LinkedListNode<I> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        I oldElement = current.getElement();
        current.setElement(element);
        return oldElement;
    }

    // This method returns the number of elements in the list.
    @Override
    public int size() {
        return size;
    }

    // This helper method prints all elements in the list.
    public void showList() {
        LinkedListNode<I> current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}