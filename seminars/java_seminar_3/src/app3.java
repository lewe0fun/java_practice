import java.util.*;

public class app3 {
    //Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
    //Удалить повторы
    public static void main(String[] args) {
        String [] planets={"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        Random rnd= new Random();
        ArrayList<String> result= new ArrayList<>();
        for (int i = 0; i < 15; i++)
            result.add(planets[rnd.nextInt(0,planets.length)]);


//        System.out.println(result);
        Set<String> mySet = new HashSet<String>(result);
        System.out.println(mySet);


//        for (int i = 0; i < result.size()-1; i++)
//        {
//            if (result.get(i)==result.get(i+1))
//                result.remove(result.get(i));i--;
//        }

    }
}
