public class Toy extends Gift{
    private char category;
    private int age;
    public Toy(String receiver, double price,char category, int age ){
        super(receiver,price);
        if(category=='e' || category=='E'|| category=='D'|| category=='d')
            this.category=category;
        else
            this.category='u';
        this.age=age;
    }
    @Override
    public String toString(){
        String y, type;
        if(category=='D'|| category=='d')
            type="educational";
        else if(category=='E'|| category=='e')
            type="electronic";
        else
            type="undefined";
        y="The toy category is "+type+", appropriate for age "+this.age+". "+super.toString();
        return y;
    }
    public char getCategory(){
        return this.category;
    }
}
