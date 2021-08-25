package other.Invoicetest.model;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double pricePerItem;

    public Invoice() {
        this.partNumber = null;
        this.partDescription = null;
        this.itemQuantity = 0;
        this.pricePerItem = 0;
    }

    public Invoice(String partNumber, String partDescription, int itemQuantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        if (itemQuantity > 0) {
            this.itemQuantity = itemQuantity;
        } else {
            this.itemQuantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getInvoiceAmount() {
        return (itemQuantity * pricePerItem);
    }

    public String toString() {
        return String.format("%10s%10s%10d%10f", this.partNumber, this.partDescription, this.itemQuantity,
                this.pricePerItem);
    }
}
