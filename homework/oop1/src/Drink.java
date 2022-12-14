 class Drink extends Product{
protected double volume;
     public Drink(String name, double cost, double volume) {
         super(name, cost);
         this.volume=volume;
     }

     public double getVolume() {
         return volume;
     }

     public void setVolume(double volume) {
         this.volume = volume;
     }

     @Override
     public String toString() {
         return "Напиток-> " +
                 "объем:" + volume +
                 ", наименование:'" + name + '\'' +
                 ", цена:" + cost;
     }
 }
