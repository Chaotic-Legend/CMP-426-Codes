public class PageNumberAndOffsetFinder implements PageNumberPageOffSetInterface {

    private int virtualAddress;
    private int pageSize;

    /**
     * No-argument constructor
     */
    public PageNumberAndOffsetFinder() {
        virtualAddress = 0;
        pageSize = 0;
    }

    /**
     * Constructor with virtual address only
     * @param virtualAddress
     */
    public PageNumberAndOffsetFinder(int virtualAddress) {
        if (virtualAddress < 0) {
            this.virtualAddress = 0;
        } else {
            this.virtualAddress = virtualAddress;
        }
    }

    /**
     * Constructor with virtual address and page size
     * @param virtualAddress
     * @param pageSize
     */
    public PageNumberAndOffsetFinder(int virtualAddress, int pageSize) {

        if (virtualAddress < 0) {
            this.virtualAddress = 0;
        } else {
            this.virtualAddress = virtualAddress;
        }
        if (pageSize <= 0) {
            this.pageSize = 0;
        } else {
            this.pageSize = pageSize;
        }
    }

    /**
     * Sets the virtual address.
     * @param virtualAddress
     */
    @Override
    public void setVirtualAddress(int virtualAddress) {
        if (virtualAddress < 0) {
            this.virtualAddress = 0;
        } else {
            this.virtualAddress = virtualAddress;
        }
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
     * Sets the page size.
     * @param pageSize
     */
    @Override
    public void setPageSize(int pageSize) {
        if (pageSize <= 0) {
            this.pageSize = 0;
        } else {
            this.pageSize = pageSize;
        }
    }

    /**
     * Returns the page size.
     * @return page size
     */
    @Override
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Computes and returns the page number.
     * @return page number
     */
    @Override
    public int getPageNumber() {
        if (pageSize == 0) {
            return 0;
        }
        return virtualAddress / pageSize;
    }

    /**
     * Computes and returns the page offset.
     * @return page offset
     */
    @Override
    public int getPageOffset() {
        if (pageSize == 0) {
            return 0;
        }
        return virtualAddress % pageSize;
    }
}
