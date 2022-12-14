public class Product {
    protected String name;
    protected double cost;

    public Product(String name, double cost) {
        this(name);
        this.cost = cost;
    }
    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Товар->" +
                " наименование: '" + name + '\'' +
                ", цена:" + cost;
    }
}
