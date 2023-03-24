import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* Задание 1 (тайминг 5 минут)
        Необходимо написать алгоритм, считающий сумму всех чисел
        от 1 до N. Согласно свойствам линейной сложности,
        количество итераций цикла будет линейно изменяться
        относительно изменения размера N.*/

        System.out.println("линейная сложность O(n) /сумма всех чисел "+sum(5)+'\n');

        /*Задание 2 (тайминг 10 минут)
        Написать алгоритм поиска простых чисел (делятся только на себя и
                на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
        вложенный for, что явно говорит о квадратичной сложности, на этом
        стоит акцентировать внимание*/

        System.out.println("квадратичная сложность O(n^2)/простые числа "+simpleDigits(10)+'\n');

/*        Задание 3 (тайминг 15 минут)
        1. Необходимо написать алгоритм поиска всех доступных комбинаций
                (посчитать количество) для количества кубиков K с количеством граней N.
        2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
        ограничено (4 кубика, например), либо их количество будет
        динамическим. Выбор за вами.
        3. Если вы реализуете простой вариант, обращает внимание, что данное
        решение имеет сложность O(n4
        ), но если количество кубиков сделать
        переменной, то она трансформируется в O(nk
        ), что будет представлять
        собой экспоненциальную сложность. Для второго решения очевидно, что
        его сложность O(nk
        ) с самого начала.*/

        System.out.println("экспонент. сложность O(n^3)/комбинации кубика "+dice(6)+'\n');

/*        1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
        2. Считаем, что 1 и 2 значения последовательности равны 1.
        3. Искать будем по формуле On=On-1+On-2 что предполагает использовать
        рекурсивного алгоритма.*/
        LocalTime localTime1 = LocalTime.now();
        System.out.println("экспонент. сложность О(2^n)/фиббоначи рекурсия "+fib(40));
        LocalTime localTime2 = LocalTime.now();
        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println(", время выполнения - " + duration1+'\n');

/*        1.Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот
        раз откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
        линейную сложность, т.к. вычисление каждого из чисел последовательности будет
        происходить ровно 1 раз.
        1.Вариантов решения может быть несколько, но нужно предложить студентам
        считать последовательность с первого числа и далее до тех пор, пока не доберемся
        до нужного номера. При этом значение предыдущих элементов нужно сохранять,
                чтобы не приходилось вычислять заново, как это происходило при рекурсивном
        методе.*/

        LocalTime localTime3 = LocalTime.now();
        System.out.println("экспонент. сложность О(n)/фиббоначи цикл "+fibFor(40));
        LocalTime localTime4 = LocalTime.now();
        Duration duration2 = Duration.between(localTime3, localTime4);
        System.out.println(", время выполнения - " + duration2+'\n');
    }
    public static int sum(int digit) //линейная
    {
        int result = 0;
        for (int i=1;i<digit;i++)
            result+=i;
        return result;
    }

    public static List<Integer> simpleDigits(int maxDigit) //квадратичная
    {
        List<Integer> result =new ArrayList<>();

        for (int i=2;i<+maxDigit;i++)
        {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if ( i%j==0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) result.add(i);
        }
        return result;

    }
    public static int dice(int side)
    {
        int result=0;
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                for (int k = 1; k <= side; k++) {
                        result++;
                    //System.out.println(i+"/"+j+"/"+k);
                }
            }
        }return result;
    }
    public static int fib (int n)
    {
        if (n <= 1) return n;
        return fib(n - 2) + fib(n - 1);
    }

    private static int fibFor(int n) {
        int first = 0;
        int second = 1;
        int result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}