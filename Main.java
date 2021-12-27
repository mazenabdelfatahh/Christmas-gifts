public class Main {

    public static void main(String[] args) {
        //a.create a client
        Client myClient=new Client("Aya Moussa");
        //b.-	Add to the array: 2 toys of different categories, and
        //1 giftCard, 1 CharityGiftCard,  1 visaGiftCard,
        Toy t1=new Toy("Ahmad taki", 25, 'D', 3);
        Toy t2=new Toy("Joe Mohana", 30, 'E', 5);

        GiftCard gcard=new GiftCard("Mirna Semaan", 15, "bankDuLiban", 200);
        VisaGiftCard vcard=new VisaGiftCard("Jamil Harb", 20, "bankFrancais", 150);
        CharityGiftCard ccard=new CharityGiftCard("Maytham Hamdan", 30, "bankDuLiban", 100, "FirasDesign");
        // add them to Client object.
        myClient.getGifts().add(t1);
        myClient.getGifts().add(t2);
        myClient.getGifts().add(gcard);
        myClient.getGifts().add(vcard);
        myClient.getGifts().add(ccard);

//Count the number of Electronic toys.
        int count=0;
        for(int i=0;i<myClient.getGifts().size();i++){
            if(myClient.getGifts().get(i) instanceof Toy){
                char category=((Toy)(myClient.getGifts().get(i))).getCategory();
                if(category=='E' ||category=='e')
                    count++;
            }
        }
        System.out.println("The number of electronic toys is "+ count);
        //Refill the visa card gifts with an amount of 200$.
        for(int i=0;i<myClient.getGifts().size();i++){
            if(myClient.getGifts().get(i) instanceof VisaGiftCard){
                ((VisaGiftCard)(myClient.getGifts().get(i))).refill(200);
            }
        }
        //List the details of all gifts.
        System.out.println("\nThe list of gift is:");
        for(int i=0;i<myClient.getGifts().size();i++){
            System.out.println("gift "+(i+1));
            System.out.println("\t"+myClient.getGifts().get(i).toString());
        }

    }
}