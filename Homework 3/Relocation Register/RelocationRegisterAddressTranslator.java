public class RelocationRegisterAddressTranslator implements PhysicalAddressRelocationRegisterInterface {

    private int virtualAddress;
    private int relocationRegister;
    private int limitRegister;

    /**
     * No-argument constructor
     */
    public RelocationRegisterAddressTranslator() {
        virtualAddress = 0;
        relocationRegister = 0;
        limitRegister = 0;
    }

    /**
     * Constructor with parameters
     * @param virtualAddress
     * @param relocationRegister
     * @param limitRegister
     */
    public RelocationRegisterAddressTranslator(
            int virtualAddress,
            int relocationRegister,
            int limitRegister) {
        this.virtualAddress = virtualAddress;
        this.relocationRegister = relocationRegister;
        this.limitRegister = limitRegister;
    }

    /**
     * Sets the virtual address.
     * @param virtualAddress
     */
    @Override
    public void setVirtualAddress(int virtualAddress) {
        this.virtualAddress = virtualAddress;
    }

    /**
     * Returns the virtual address.
     * @return virtual address
     */
    @Override
    public int getVirtualAddress() {
        return virtualAddress;
    }

    /**
     * Sets the relocation register.
     * @param relocationRegister
     */
    @Override
    public void setRelocationRegister(int relocationRegister) {
        this.relocationRegister = relocationRegister;
    }

    /**
     * Returns the relocation register.
     * @return relocation register
     */
    @Override
    public int getRelocationRegister() {
        return relocationRegister;
    }

    /**
     * Sets the limit register.
     * @param limitRegister
     */
    @Override
    public void setLimitRegister(int limitRegister) {
        this.limitRegister = limitRegister;
    }

    /**
     * Returns the limit register.
     * @return limit register
     */
    @Override
    public int getLimitRegister() {
        return limitRegister;
    }

    /**
     * Computes the physical address.
     * Formula:
     * Physical Address = Relocation Register + Virtual Address
     *
     * @return physical address
     * @throws IllegalArgumentException if virtual address is invalid
     */
    @Override
    public int computePhysicalAddress() {
        if (virtualAddress < 0 || virtualAddress >= limitRegister) {
            throw new IllegalArgumentException(
                "Virtual address is out of bounds."
            );
        }
        return relocationRegister + virtualAddress;
    }
}
