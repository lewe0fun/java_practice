
//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.sql.SQLOutput;

public class app1 {

    public static void main(String[] args) {
        String chars="ab";
        int n=10;
        String result="";
        for (int i = 0; i < n; i++) {
            result+=chars.charAt(i%2);
        }
        System.out.println(result);
    }

}