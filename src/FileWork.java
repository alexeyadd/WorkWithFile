import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWork {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("d:\\WorkWithFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string;

        do {
            string = bufferedReader.readLine();
            System.out.println(string);
        } while (string != null);

        bufferedReader.close();
        fileReader.close();
    }
}
