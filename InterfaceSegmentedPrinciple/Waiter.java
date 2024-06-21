package InterfaceSegmentedPrinciple;
//Interface Segmented Principle : Interface should be such that client should implementation unnecessary functions they do not need. 
public class Waiter implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("serve the customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("take the orders");
    }
}
