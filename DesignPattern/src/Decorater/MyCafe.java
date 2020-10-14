package Decorater;

public class MyCafe
{
    public static void main(String[] args)
    {
        Meal vegMeal = prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = prepareNormalMeal();
        System.out.println("\n\nNormal Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

    public static Meal prepareVegMeal ()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareNormalMeal ()
    {
        Meal meal = new Meal();
        meal.addItem(new ChickBurger());
        meal.addItem(new Juice());
        return meal;
    }
}
