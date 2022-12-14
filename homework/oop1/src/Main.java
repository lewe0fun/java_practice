import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
//Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine и реализовать перегруженный метод getProduct(String name, double volume, double temperature), выдающий продукт соответствующего имени, объема и температуры.
//В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine и воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class Main {
    public static void main(String[] args) {

        List<HotDrink> hotDrinks=new ArrayList<>(Arrays.asList(
                new HotDrink("coffee",550.0,400.0,45),
                new HotDrink("tea",100.0,500.0,45),
                new HotDrink("green tea",150.0,500.0,45),
                new HotDrink("water",0.0,1000.0,70),
                new HotDrink("cappuccino",600.0,450.0,45)));
        for(var i: hotDrinks)
            System.out.println(i);

        VendingMachine vm=new HotDrinkVendingMachine();
        HotDrinkVendingMachine vm2=new HotDrinkVendingMachine();
        HotDrinkVendingMachine vm3=new HotDrinkVendingMachine();
        System.out.println("выдано: "+vm.getProduct("cok",100.0));
        System.out.println("выдано: "+vm2.getProduct("кофе",100.0,250.,45));
        System.out.println("выдано: "+vm3.getProduct("чай",50.0,250.));
    }

}