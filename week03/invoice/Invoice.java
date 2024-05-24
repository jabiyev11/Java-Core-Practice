package invoice;

public class Invoice {
    private String partNumber; 
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) throws IllegalArgumentException{
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);     //To consider negative numbers
        setPricePerItem(pricePerItem); // To consider negative numbers
    }


    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartNumber(){
        return this.partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setQuantity(int quantity){
        
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity can not be negative");
        }
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPricePerItem(double pricePerItem){
        if( pricePerItem < 0.0){
            throw new IllegalArgumentException("Price can not be negative");
        }
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    public double getInvoiceAmount(){
        return quantity * pricePerItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Part Number: ").append(partNumber).append(", Description: ").append(partDescription)
          .append(", Quantity: ").append(quantity).append(", Price Per Item: ").append(pricePerItem);
        return sb.toString();
    }
}
