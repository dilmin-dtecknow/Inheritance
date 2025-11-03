public class CashOnDelivery extends Payment{

    private String deliveryAddress;

    public CashOnDelivery(double amount, String currency, String deliveryAddress) {
        super(amount, currency);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Cash will be collected at delivery address: "+deliveryAddress);
        markAsCompleted();
    }

    @Override
    public boolean validate() {
        boolean valid = deliveryAddress !=null && !deliveryAddress.isEmpty();
        System.out.println("Validating cash on delivery Address: "+(valid ? "OK" : "NO, INVALID"));
        return valid;
    }
}
