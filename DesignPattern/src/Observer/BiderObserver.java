package Observer;

public class BiderObserver implements IObserver
{
    private int currentPrice;
    private int myBid;
    private String name;

    BiderObserver(String name)
    {
        this.name = name;
    }

    public void bid(int amount)
    {
        myBid = amount;
    }

    public void reset()
    {
        currentPrice = 0;
        myBid = 0;
    }

    public void update(int currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }
    public int getMyBid() {
        return myBid;
    }
    public String getName() {
        return name;
    }
}
