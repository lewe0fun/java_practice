import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
//сравнение Deque и LinkedList
public class app1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        LinkedList<Integer> ll =new LinkedList<>();
        LocalTime start=LocalTime.now();
        for (int i = 0; i < 10000000; i++) {
            dq.add(i);
        }
        LocalTime stop=LocalTime.now();
        Duration diff = Duration.between(start,stop);
        System.out.println(diff);
    }
}
