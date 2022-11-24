//*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
public class app4 {
    public static boolean check(String digit1,String qInt)
    {
        if(digit1.length()==qInt.length()) {
        int counterXValue=0;
        int counterChecks=0;
        for (int i=0;i<digit1.length();i++)
            if(digit1.charAt(i)=='?')counterXValue++;
        for(int i =0;i<digit1.length();i++)
            if (digit1.charAt(i)!='?')
                if(digit1.charAt(i)==qInt.charAt(i))
                    counterChecks++;
        if((digit1.length()-counterXValue)==counterChecks)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        String input = "3?1+?4?=1167";
        String input = "??1+?4?=1167";
//        String input = "???1+?4?=1167";
//        String input = "2?36+6?=2601";
//        String input="2?+?5=69";
//        String input ="2?4+9?=355";
        String digit1="",digit2="",result="";
        int plusPos=0, equalPos=0,counter=0;
        for(int i=0; i<input.length();i++) {
            if(input.charAt(i)=='+')plusPos=i;
            if(input.charAt(i)=='=')equalPos=i;
        }
        digit1=input.substring(0,plusPos);
        digit2=input.substring(plusPos+1,equalPos);
        result=input.substring(equalPos+1);
        System.out.printf("У уровнения типа: %s+%s=%s\n",digit1,digit2,result);
        for (int i=0;i<=Integer.parseInt(digit1.replace('?','9'));i++)
            for (int j =0; j<=Integer.parseInt(digit2.replace('?','9'));j++)
                if(i+j==Integer.parseInt(result))
                    if(check(digit1,String.valueOf(i)) && check(digit2,String.valueOf(j))) {
                        System.out.printf("%d+%d=%d\n",i,j,Integer.parseInt(result));counter++;
                    }
        if (counter==0) System.out.println("Нет решений");
        else System.out.printf("Решений %d",counter);
    }
}