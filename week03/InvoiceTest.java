import invoice.Invoice;
public class InvoiceTest{

    public static void main(String args[]){
       
       try {

        Invoice invoice1 = new Invoice("0001", "Door Locks", 3, 25.90);
        System.out.println("Invoice 1: ");
        System.out.println("Part number: " + invoice1.getPartNumber());
        System.out.println("Part Description: "+ invoice1.getPartDescription());
        System.out.println("Quantity: "+ invoice1.getQuantity());
        System.out.println("Price per item: "+ invoice1.getPricePerItem());
        System.out.println("Invoice amount: "+ invoice1.getInvoiceAmount());


        Invoice invoice2 = new Invoice("0002", "Screwdrivers", -4, -15.80);
        System.out.println("Invoice 2: ");
        System.out.println("Par number: " + invoice2.getPartNumber());
        System.out.println("Part Description: "+ invoice2.getPartDescription());
        System.out.println("Quantity: "+ invoice2.getQuantity());
        System.out.println("Price per item: "+ invoice2.getPricePerItem());
        System.out.println("Invoice amount: "+ invoice2.getInvoiceAmount());
       
    }catch(IllegalArgumentException e){
        System.out.println("Error: " + e.getMessage());
    }

    }
}