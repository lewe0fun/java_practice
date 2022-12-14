public class HotDrinkVendingMachine extends VendingMachine{

    public Product getProduct (String name,double cost,double volume)
    {
        return new Drink(name,cost,volume);
    }

    public Product getProduct (String name,double cost,double volume,int temperature)
    {
        return new HotDrink(name,cost,volume,temperature);
    }
}
