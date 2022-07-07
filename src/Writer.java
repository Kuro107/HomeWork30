import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws IOException {
        try {


            FileWriter fileWriter = new FileWriter("text3.txt");
            fileWriter.write("Unchecked exceptions - Это те ошибки за которыми мы не можем уследить. ");
            fileWriter.write("Checked exceptions - это те ошибки которые мы должны отловить, обработать, выбросить");
            fileWriter.write("\nkonec");
            fileWriter.close();

            String result = "";

            Scanner scanner = new Scanner(new FileReader("text3.txt"));

            while (scanner.hasNextLine()) {
                String news = "";
                String[] split = scanner.nextLine().split("\\s+");
                for (String s : split) {
                    news = news + s;
                }
                result = result + news + "\n";
                System.out.println(news);
            }
            System.out.println(result);
        }
        catch (IllegalStateException e){
            System.out.println("CODE IS VERY LONG");
        }
    }
}