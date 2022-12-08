import java.util.HashMap;
import java.util.Map;

//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны,
// если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true
public class app2 {
    public static void main(String[] args) {
        System.out.println(check("paper","title"));

    }
    public static boolean check(String str1,String str2)
    {
        if (str1.length()!=str2.length())
            return false;
        else if(str1.equals((str2)))
            return true;
        Map<Character,Character> subWord=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char a= str1.charAt(i);
            char b =str2.charAt(i);
            if(subWord.containsKey(a)){
                if(b!= subWord.get(a))
            return false;}
            else subWord.put(a,b);
        }return true;
    }
}
