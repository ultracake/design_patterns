package Observer;

public class MyAuctionHouse
{
    public static void main(String[] args)
    {
        IObserver bider1 = new BiderObserver("Ape");
        IObserver bider2 = new BiderObserver("Doggo");
        IObserver bider3 = new BiderObserver("Jack");
        IObserver bider4 = new BiderObserver("Joker");

        AuctioneerObservable auctioneer = new AuctioneerObservable();
        auctioneer.attachOb(bider1);
        auctioneer.attachOb(bider2);
        auctioneer.attachOb(bider3);
        auctioneer.attachOb(bider4);

        System.out.println("the item is available: " + auctioneer.currentItem);

        bider1.bid(12);
        auctioneer.checkBed(bider1);

        bider2.bid(9);
        auctioneer.checkBed(bider2);

        bider3.bid(20);
        auctioneer.checkBed(bider3);

        System.out.println("the current highest bid: " + bider1.getCurrentPrice());

        bider4.bid(25);
        auctioneer.checkBed(bider4);

        bider2.bid(26);
        auctioneer.checkBed(bider2);
    }
}
