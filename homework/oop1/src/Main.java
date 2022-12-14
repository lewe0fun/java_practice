import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
//Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine и реализовать перегруженный метод getProduct(String name, double volume, double temperature), выдающий продукт соответствующего имени, объема и температуры.
//В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine и воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class Main {
    public static void main(String[] args) {

        List<Drink> hotDrinks=new ArrayList<>(Arrays.asList(
                new HotDrink("coffee",550.0,400.0,45),
                new HotDrink("tea",100.0,500.0,45),
                new HotDrink("green tea",150.0,500.0,45),
                new Drink("water",0.0,1000.0),
                new HotDrink("cappuccino",600.0,450.0,45),
                new Drink("juice",10.0,100.0)));

        for(var i: hotDrinks)
            System.out.println(i);

        VendingMachine vm=new HotDrinkVendingMachine();
        HotDrinkVendingMachine vm2=new HotDrinkVendingMachine();
        HotDrinkVendingMachine vm3=new HotDrinkVendingMachine();
        HotDrinkVendingMachine vm4=new HotDrinkVendingMachine();
        vm.makeProduct(vm.getProduct("cok",100.0));
        vm2.makeProduct(vm2.getProduct("кофе",100.0,250.0,45));
        vm3.makeProduct(vm3.getProduct("чай",50.0,250.0));
        vm4.makeProduct(vm4.getProduct("вода"));
    }

}