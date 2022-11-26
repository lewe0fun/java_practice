//полиндром
public class app2 {
    public static void main(String[] args) {
        String chars="00c0c00";
        int counter=0;
        for (int i = 0; i < chars.length()/2; i++)
            if(chars.charAt(i)==chars.charAt(chars.length()-i-1))
                counter++;

        System.out.println(chars);
        if(counter>=(chars.length()/2))
        System.out.println("полиндром");
        else System.out.println("не полиндром");
}}
