package Facade;

//The Facade class, small example
public class Mall
{
    private Mall_Info_Interface cakeshop;
    private Mall_Info_Interface burgershop;

    public Mall()
    {
        cakeshop = new Cakeshop();
        burgershop = new Burgershop();
    }

    public void getCakeMenu()
    {
        cakeshop.getMenu();
    }

    public void getBurgerMenu()
    {
        burgershop.getMenu();
    }
}
