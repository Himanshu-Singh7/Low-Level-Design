package SingleResponsibilityPrinciple;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * quantity);  // 1 responsibility
        return price;
    }
    // Solution : we can not do this type we make a separate class for both method
    /*public void printInvoice(){
        // print the invoice        // 2  responsibility
    }

    public void saveDB(){
        // save into DB          // 3  responsibility
    }*/
}
