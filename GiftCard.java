public class GiftCard extends Gift{
    private String bankName;
    private double amount;

    public GiftCard(String reciever, double price, String bankName, double amount) {
        super(reciever, price);
        this.bankName = bankName;
        this.amount = amount;
    }
    public String getBankName(){
        return bankName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "GiftCard{" + "bankName='" + bankName + '\'' + ", amount=" + amount + '}';
    }
}