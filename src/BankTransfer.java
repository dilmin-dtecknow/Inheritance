public class BankTransfer extends Payment{

    private String bankName, accountNumber, referenceCode;

    public BankTransfer(double amount, String currency,  String bankName, String accountNumber, String referenceCode) {
        super(amount, currency);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;
    }

    @Override
    public void processPayment() {
        System.out.println("Initiating bank transfer to <"+bankName+">" +
                " using account <"+accountNumber+">" +
                " with reference <"+referenceCode+">");
        markAsCompleted();
    }

    @Override
    public boolean validate() {
        boolean valid = bankName !=null && !bankName.isEmpty() && accountNumber !=null && !accountNumber.isEmpty() && accountNumber.length() >=6;
        System.out.println("Validating Bank Transfer "+(valid ? "OK" : "NO, FAILED"));
        return valid;
    }
}
