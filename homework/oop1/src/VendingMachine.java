
public class VendingMachine {


    public Product getProduct (String name)
    {
        return new Product(name);
    }
    public Product getProduct (String name, Double cost)
    {
        return new Product(name,cost);
    }
public void makeProduct(Product p)
{
    System.out.println("Выдано"+p);
}
}
