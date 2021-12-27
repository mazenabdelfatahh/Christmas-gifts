public class CharityGiftCard extends GiftCard{
    private String designedby;
    public CharityGiftCard (String receiver, double price,String bank, double amount ,String designedby){
        super( receiver,  price, bank, amount);
        this.designedby=designedby;
    }
    @Override
    public String toString(){
        return "It is a charity gift card designed by "+this.designedby+". "+super.toString();
    }

}
