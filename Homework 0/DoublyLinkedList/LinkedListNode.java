// CMP 426: Operating Systems - Homework 0 - Isaac D. Hoyos

public class LinkedListNode<I extends java.lang.Comparable<? super I>> {
    // This field stores the element in the node.
    private I element;

    // This field stores the reference to the next node.
    private LinkedListNode<I> next;

    // This field stores the reference to the previous node.
    private LinkedListNode<I> previous;

    // This constructor initializes the node with an element and sets next and previous to null.
    public LinkedListNode(I element) {
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    // This constructor initializes the node with an element and sets the next node.
    public LinkedListNode(I element, LinkedListNode<I> next) {
        this.element = element;
        this.next = next;
        this.previous = null;
    }

    // This method returns the element stored in the node.
    public I getElement() {
        return element;
    }

    // This method sets the element stored in the node.
    public void setElement(I element) {
        this.element = element;
    }

    // This method returns the next node reference.
    public LinkedListNode<I> getNext() {
        return next;
    }

    // This method sets the next node reference.
    public void setNext(LinkedListNode<I> next) {
        this.next = next;
    }

    // This method returns the previous node reference.
    public LinkedListNode<I> getPrevious() {
        return previous;
    }

    // This method sets the previous node reference.
    public void setPrevious(LinkedListNode<I> previous) {
        this.previous = previous;
    }
}
