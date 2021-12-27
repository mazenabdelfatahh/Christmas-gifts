public class Gift {
    private String receiver;
    private double price;
    public 	Gift(String receiver, double price) {
        this.receiver=receiver;
        if(price>=0)
            this.price=price;
        else
            this.price=0;
    }
    @Override
    public String toString(){
        return "The gift is offered to "+this.receiver+". It costs "+ this.price+"$.";
    }

}
