//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
import java.io.FileWriter;
import java.io.IOException;

public class app3 {

    public static void main(String[] args) {
        flushToFile(getText());
    }
    public static String getText()
    {
        String txt="";
        for (int i = 0; i < 100; i++)
            txt+="TEST\n";
        return txt;
    }
    public static void flushToFile(String txt)
    {
        try(FileWriter fw = new FileWriter("file.txt",false))
        {
            fw.write(txt);
            fw.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
