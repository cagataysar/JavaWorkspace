import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class MyReader {

    public static void main (String[] args) throws Exception {
//        readWords("C:/dosya.txt");
        readLineAt("C:/dosya.txt", 3);
    }

    public static void readWords (String path) throws IOException {
        File file = new File(URI.create("file:/C://Users//sario//Desktop//dosya.txt"));
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        while ( line != null ) { // bufferedReader.ready() son satırı okumuyor
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    public static void readLineAt (String path, int line) throws IOException {
        java.io.File file = new File(URI.create("file:/C://Users//sario//Desktop//dosya.txt"));
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);

        ArrayList< String > strArray = new ArrayList<>();

        while ( bufferedReader.ready() ) {
            strArray.add(bufferedReader.readLine());
        }
        if ( line <= strArray.size() ) {
            System.out.println(strArray.get(line - 1));
        } else {
            System.out.println("Satır sayısından fazla değer!");
        }
        bufferedReader.close();
    }
}