

/** 
 * 
 * Write a Java program called PageNumberAndOffsetFinder that implements this given interface. 
 * <br>
 * <br>
 * The program calculates the page number and the page offset from a given virtual address and page size.
 * <br>
 * <br> 
 * This exercise will help you understand how memory is organized in a system that uses paging, a memory addressing mechanism.
 * In a system using paging, physical memory is divided into fixed-size blocks called frames (pages). When a program accesses a memory address, that address is split into two parts:
 * <ul>
 * <li>Page Number: Determines which page of memory the address is located in.</li>
 * <li>Page Offset: Determines the exact location within that page.</li>
 * </ul>
 * <br>
 * Given:<br>
 * 
 * Virtual Address: A 32-bit virtual address.<br>
 * Page Size: The size of each page in bytes  as 512 bytes, 1024 bytes, 4096 bytes<br>
 * You will be required to calculate the page number and the page offset using the following two components:
 * <br>
 * <br>
 * Page Number = Virtual Address / Page Size<br>  
 * Page Offset = Virtual Address % Page Size<br>
 * <br>
 * As an example, your program would run as follows:
 * <br>
 * addresses 19986 for a page size of 4KB (4096 bytes)
 * <br>
 * page number = 4
 * <br>
 * offset = 3602
 * <br>
 * 
 *  @author Steven Fulakeza
 *  
 */
public interface PageNumberPageOffSetInterface {
	
	/**
	 * This method is used to set the virtual address.
	 * @param virtualAddress
	 */
	public void setVirtualAddress(int virtualAddress);	
	
	/**
	 * This method returns the virtual address
	 * @return
	 */
	public int getVirtualAddress();
	
	/**
	 * This method is used to set the page size of the memory.
	 * @param pageSize
	 */
	public void setPageSize(int pageSize);
	
	/**
	 * This method gets and returns the page size of the memory.
	 * @return
	 */
	public int getPageSize();
	

	/** 
	 * This method computes and returns a page number based
	 * on the virtual address and page size.
	 * @return
	 */
	public int getPageNumber() ;
	
	
	/**
	 * This method computes and returns a page offset based
	 * on the virtual address and page size.
	 * @return
	 */	
	public int getPageOffset() ;

}
