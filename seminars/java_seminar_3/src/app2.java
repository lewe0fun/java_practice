import java.util.*;

public class app2 {
    //Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
    public static void main(String[] args) {
String [] planets={"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
Random rnd= new Random();
        ArrayList<String> result= new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            result.add(planets[rnd.nextInt(0,planets.length)]);

        }
//        System.out.println(result);
//        for (String i : result) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < result.toArray().length; i++) {
//            if(result.get(i) ==result[i+1])
//        }
        System.out.println(result);
        Set<String> mySet = new HashSet<String>(result);
        for(String s: mySet){
            System.out.println(s + " " + Collections.frequency(result,s));
        }



    }
}
