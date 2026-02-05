// CMP 426: Operating Systems - Homework 0 - Isaac D. Hoyos

public class LinkedListNode<I extends java.lang.Comparable<? super I>> {

    // This field stores the data element in the node.
    private I element;

    // This field stores the reference to the next node.
    private LinkedListNode<I> next;

    // This constructor initializes the node with an element and sets next to null.
    public LinkedListNode(I element) {
        this.element = element;
        this.next = null;
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
}