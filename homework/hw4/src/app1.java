import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class app1 {
    public static void main(String[] args) {

        LinkedList<Integer> value = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            value.addLast(i);
        System.out.println(value);
        System.out.println(revert(value));
    }

    public static LinkedList<Integer> revert(LinkedList<Integer> value) {
        int length = value.size();
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            result.addFirst(value.removeFirst());
        }
        return result;
    }
}
