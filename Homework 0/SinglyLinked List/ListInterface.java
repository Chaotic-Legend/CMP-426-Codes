/** 
 *
 * @param <I> This is the interface for the List Abstract Data Type (ADT).
 * Please note that this interface uses the generic type I, which either implements the Comparable interface, or some superclass of I implements the Comparable interface
 */
public interface ListInterface <I extends java.lang.Comparable<? super I>>{
	
	/**
	 * This method is called to add the specified Element to the end of the list.
	 * @param element
	 */
	public void add(I element);
	
	/**
	 * This method is called to add the specified element to the list at the given index.
	 * @param element
	 * @param index
	 */
	public void add(I element, int index);
	
	/**
	 * This method is called to add the specified Element to the list in sorted order. 
	 * @param element
	 */
	public void addSorted(I element);
	
	/**
	 * This method will make a copy of the list and return it.
	 * @return
	 */
	public ListInterface<I>	copy();
	
	/**
	 * This method is called to retrieve the Element at the specified index.
	 * @param index
	 * @return
	 */
	public I get(int index);
	
	/**
	 * This method is called to determine if the list is empty.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * This method is called to remove the Element at the specified index
	 * @param index
	 * @return
	 */
	public I remove(int index);
	
	
	/**
	 * This method removes all Elements from the list, making the list empty.
	 * 
	 * */
	public void removeAll();
	
	/**
	 * This method is called to replace the element at the specified index with the specified element.
	 * @param element
	 * @param index
	 * @return
	 */
	public I replace(I element, int index);

	/**
	 * This method is called to obtain the count of elements in the list.
	 * @return
	 */
	public int size();

}
