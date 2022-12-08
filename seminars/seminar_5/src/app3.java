import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

////Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
////Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
public class app3 {
    public static void main(String[] args) {
String txt="Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
//        rawPrintSort(txt);
        fineSortMap(txt);

    }
    public static void rawPrintSort(String str)
    {
        TreeMap<Double,String>tree=new TreeMap<>();
        String[]strMas=str.split(" ");
        System.out.println(strMas.length+" слов:");
        for (int i = 0; i < strMas.length; i++) {
            if (tree.containsKey((double)strMas[i].length())) {
                tree.put(strMas[i].length() + 0.0000001*i, strMas[i]);
            } else {
                tree.put((double) strMas[i].length(), strMas[i]);
            }
        }
            for(var ii:tree.entrySet())
            {
                System.out.print(ii.getKey() + " " + ii.getValue() + "\n");
            }

    }
    public static void fineSortMap(String s){

        TreeMap<Integer, List<String>> tree = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for(int i=0; i<sMas.length;i++){
            if(tree.containsKey(sMas[i].length()))
            {
              tree.get(sMas[i].length()).add(sMas[i]) ;

            } else {   List<String>lst=new ArrayList<>();
                lst.add(sMas[i]);
                tree.put(sMas[i].length(),lst);
            }

        }

        for (var el : tree.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }

    }

}
