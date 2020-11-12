package Observer;

public interface IObserver
{
    void update(int currentPrice);
    void bid(int amount);
    void reset();
    int getMyBid();
    String getName();
    int getCurrentPrice();
}
