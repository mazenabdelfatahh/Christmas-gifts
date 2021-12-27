public class VisaGiftCard extends GiftCard {
    public VisaGiftCard(String receiver, double price,String bank, double amount ){
        super(receiver, price, bank, amount);
    }
    public void refill (double amount){
        double newAmount=super.getAmount()+amount;
        super.setAmount(newAmount);
    }
    @Override
    public String toString(){
        return "It is a visa gift card. "+super.toString();
    }
}
