import java.util.ArrayDeque;
import java.util.Deque;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//
//a+(d*3) - истина
//\[a+(1*3) - ложь
//\[6+(3*3)] - истина
//{a}\[+\]{(d*3)} - истина
//<{a}+{(d*3)}> - истина
//{a+]}{(d*3)} - ложь
public class app3 {

    public static void main(String[] args) {
        check("a+(d*3)");
        check("[a+(1*3)");
        check("[6+(3*3)]");
        check("{a}[+]{(d*3)}");
        check("<{a}+{(d*3)}>");
        check("{a+]}{(d*3)}");
    }

    public static void check(String exp) {
        String quotes = "([{<";
        Deque<Character> stack = new ArrayDeque<>();
        boolean result = true;
        for (int i = 0; i < exp.length(); i++) {
            Character current = exp.charAt(i);
            for (int j = 0; j < quotes.length(); j++) {
                Character open = quotes.charAt(j);
                Character close = revert(quotes.charAt(j));
                if (current.equals(open)) {
                    stack.addLast(close);
                } else if (current.equals(close)) {
                    if (!stack.isEmpty()) {
                        Character last = stack.peekLast();
                        if (current.equals(last)) {
                            stack.pollLast();
                        } else {
                            result = false;
                            break;
                        }
                    }

                }

            }

        }
        if (!stack.isEmpty()) result = false;
        System.out.println(exp + " " + result);
    }

    public static Character revert(Character ch) {
        return switch (ch) {
            case '(' -> ')';
            case '{' -> '}';
            case '[' -> ']';
            case '<' -> '>';
            default -> '0';
        };
    }
}