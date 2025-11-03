import java.util.UUID;

public abstract class Payment implements Payable{
    public double amount;
    public String currency,status, referenceId;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "PENDING";
        this.referenceId = "TXN-"+ UUID.randomUUID().toString().substring(0,6);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Abstract methode
    public abstract void processPayment();

    //concrete method
    public void generateReceipt() {
        System.out.println("Receipt for amount "+amount+" currency "+currency+" | Status "+status);
    }

    public void markAsCompleted() {
        this.status = "COMPLETED";
        System.out.println("Marked as completed");
    }

    @Override
    public String getReference() {
        return referenceId;
    }
}
