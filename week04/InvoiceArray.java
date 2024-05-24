package week04;
import java.util.Scanner;
import invoice.*;

public class InvoiceArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of invoices: ");
        int invoiceNumber = sc.nextInt();
        sc.nextLine();

        Invoice[] invoices = new Invoice[invoiceNumber];

        for(int i = 0; i < invoiceNumber; i++){
            System.out.println("Invoice " + (i + 1) + ":");
            System.out.print("Enter Part Number: ");
            String partNumber = sc.nextLine();
            System.out.print("Enter Part Description: ");
            String partDescription = sc.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter Price per Item: ");
            double pricePerItem = sc.nextDouble();
            System.out.println();
            sc.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }

        for(int i = 0; i < invoiceNumber; i++){
            System.out.println("Invoice " + (i + 1) + ":");
            System.out.println("Part Number " + invoices[i].getPartNumber());
            System.out.println("Part Description " + invoices[i].getPartDescription());
            System.out.println("Quantity " + invoices[i].getQuantity());
            System.out.println("Price Per Item " + invoices[i].getPricePerItem());
            System.out.println("Invoice Amount " + invoices[i].getInvoiceAmount() + "\n");
        }

        sc.close();
    }
    
}
