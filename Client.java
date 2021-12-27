import java.util.ArrayList;

public class Client {
    private String	Name;
    private ArrayList<Gift> gifts;
    public	Client(String Name) {
        this.Name=Name;
        this.gifts=new ArrayList<Gift>();
    }
    public	String toString(){
        String y="client name is "+this.Name;
        for(int i=0;i <gifts.size();i++)
            y+=this.gifts.get(i).toString()+"\n";
        return y;
    }
    public	ArrayList<Gift> getGifts(){
        return this.gifts;
    }
    public String getName(){
        return this.Name;
    }
}
