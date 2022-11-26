//Напишите метод, который вернет содержимое текущей папки в виде массива строк. Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//        Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class app4 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\IOPA\\java_practice\\seminars\\java_seminar_2\\seminar2";
        writeToFile(getFolderContent(path));
   }
   public static List<String> getFolderContent(String path)
   {
       List<String> folderContent=new ArrayList<>();
       File dir = new File(path);
       if(dir.isDirectory())
       {
           for(File item : dir.listFiles()){

               if(item.isDirectory())
                   folderContent.add("папка\t"+item.getName());
               else
                   folderContent.add("файл\t"+item.getName());
           }
       }
       return folderContent;
   }
   public static void writeToFile(List<String> content) throws IOException {
       try(FileWriter cont = new FileWriter("content.txt",false))
       {
           for (String c:content) {
               cont.write(c+"\n");
           }
           cont.flush();
       }
       catch(IOException ex)
       {
           FileWriter log = new FileWriter("log.txt",false);
           log.write(ex.getMessage());
           log.flush();
       }
   }
}
