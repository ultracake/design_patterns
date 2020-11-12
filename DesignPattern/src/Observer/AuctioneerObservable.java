package Observer;

import java.util.ArrayList;
import java.util.List;

public class AuctioneerObservable
{
    String currentItem = "pic_of_cakes";
    int price = 10;

    List<IObserver> bidersList = new ArrayList<>();

    public void attachOb(IObserver bider)
    {
        bidersList.add(bider);
        //System.out.println("Has been added");
    }

    public void detachOb(IObserver bider)
    {
        bidersList.remove(bider);
        //System.out.println("Has been removed");
    }

    public void checkBed(IObserver bider)
    {
        int newBid = bider.getMyBid();
        if (newBid > price)
        {
            price = newBid;
            notifyObs();
            System.out.println("the new highest bid: " + price);
            System.out.println("from mister: " + bider.getName());
        }else
        {
            System.out.println("Not enough");
        }
    }

    public void notifyObs()
    {
        for (int i = 0; i < bidersList.size(); i++)
        {
            bidersList.get(i).update(price);
        }
        //System.out.println("every one has been updated");
    }

    public void resetOb()
    {
        for (int i = 0; i < bidersList.size(); i++)
        {
            bidersList.get(i).reset();
        }
        //System.out.println("every one has been updated");
    }
}
