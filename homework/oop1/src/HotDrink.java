public class HotDrink extends Drink{
    protected int temperature;
    public HotDrink(String name, double cost, double volume,int temperature) {
        super(name, cost,volume);
        this.temperature=temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток->" +
                "температура:" + temperature +
                ", объем:" + volume +
                ", наименование:'" + name + '\'' +
                ", цена:" + cost;
    }
}
