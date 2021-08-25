package other.Invoicetest;

import other.Invoicetest.model.Invoice;

import java.util.Scanner;

class InvoiceTest {
    private Invoice invoice = new Invoice();
    private static Scanner sc = new Scanner(System.in);

    public void acceptRecord() {
        System.out.println("Enter Part Number	:	");
        this.invoice.setPartNumber(sc.nextLine());
        System.out.println("Enter Part Description	:	");
        this.invoice.setPartDescription(sc.nextLine());
        System.out.println("Enter Item Quantity	:	");
        this.invoice.setItemQuantity(sc.nextInt());
        System.out.println("Enter Item Price	:	");
        this.invoice.setPricePerItem(sc.nextInt());
    }

    public void printRecord() {
        invoice.getPartNumber();
        System.out.println("Part Number	: " + this.invoice.getPartNumber());
        invoice.getPartDescription();
        System.out.println("Part Description : " + this.invoice.getPartDescription());
        invoice.getItemQuantity();
        System.out.println("Item Quantity : " + this.invoice.getItemQuantity());
        System.out.println("Item Price : " + this.invoice.getPricePerItem());
    }

    public static int menuList() {
        System.out.println("0.Exit");
        System.out.println("1.Accept Record");
        System.out.println("2.Print Record");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }
}
