/**
 * In this assignment, you will be implementing a system where we calculate the physical address given a virtual address, using a relocation register and a limit register. 
 * <br>
 * The system should ensure that the virtual address is within the valid address range so that it is less than the value in the limit register. 
 * <br>
 * If the address is invalid (i.e., the virtual address exceeds the limit), an IllegalArgumentException should be thrown.
 * <br>
 * Please review your notes and read the textbook to understand how limit registers and relocation registers are used to manage memory.
 * <br><br>
 * Now write a Java program called RelocationRegisterAddressTranslator that implements this given interface.
 * <br>
 * Your answer is submitted via zyBooks. You are allowed multiple submissions. ZyBooks will autograde your submission.
 * <br>
 * 
 *  @author Steven Fulakeza
 */
public interface PhysicalAddressRelocationRegisterInterface {

	/**
	 * This method is used to set the virtual address.
	 * @param virtualAddress the address to be translated
	 */
	public void setVirtualAddress(int virtualAddress);	
	
	/**
	 * This method returns the virtual address
	 * @return virtual address
	 */
	public int getVirtualAddress();
	
	/**
	 * This method is used to set the relocationRegister.
	 * @param relocationRegister value of the the process
	 */
	public void setRelocationRegister(int relocationRegister);
	
	/**
	 * This method returns the relocation register.
	 * @return the relocationRegister the base address in physical memory
	 */
	public int getRelocationRegister();
	
	/**
	 * This method is used to set the limit register
	 * @param limitRegister the size of the virtual address space
	 */
	public void setLimitRegister(int limitRegister);
	
	/**
	 * This returns the limitRegister.
	 * @return limitRegister
	 */
	public int getLimitRegister();
	
	 /**
     * Computes the physical address based on the virtual address,
     * using a relocation register and a limit register.
     * @return the corresponding physical address
     * @throws IllegalArgumentException if the virtual address is out of bounds
     */
    public int computePhysicalAddress();
}
