import java.io.*;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    //    Main metot'tan exception fırlatmak mantıklı değil burda örnekleri rahat görmek için yaptık
    //    Çünkü bu exception biyerlerde handle edilmeli. Bu yüzden fırlatıyoruz zaten
    public static void main (String[] args) throws Exception {
//        ornek1();
//        ornek2();
//        ornek3();
//        ornek4();
//        ornek5();
//        ornek6();
//        ornek7();
//        ornek8();
//        ornek9();
//        stringislemi();
    }

    private static void stringislemi () {
        String sonuc = "";
        StringBuilder builder = new StringBuilder();
        long milis = System.currentTimeMillis();
        for (int i = 0; i < 30_000; i++) {
            sonuc += "a";
//            sonuc = sonuc.concat("a"); // aynı işi yapıyor
        }
        long milis2 = System.currentTimeMillis();
        System.err.println("işlem bitti => " + (milis2 - milis) + " - " + sonuc.length());
        sonuc = "";
        // -----------------
        milis = System.currentTimeMillis();
        for (int i = 0; i < 30_000_000; i++) {
            builder.append("a");
        }
        sonuc = builder.toString();
        milis2 = System.currentTimeMillis();
        System.err.println("işlem bitti => " + (milis2 - milis) + " - " + sonuc.length());
    }

    private static void ornek9 () throws IOException {
        java.io.File file = new File(URI.create("file:/C://Users//sario//Desktop//dosya.txt"));
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        while ( bufferedReader.ready() ) {
            // sonuc += bufferedReader.readLine();
            builder.append(bufferedReader.readLine()).append("\n");
        }
        bufferedReader.close();
        System.err.println(builder.toString());
    }

    private static void ornek8 () throws Exception {
        Path path = Path.of("C://Users//sario//Desktop//dosya.txt");
        String text = "\nyeni bilgiler yeni satır lskgjldjg";
        // openoption vermezsem eziyor
        Files.writeString(path, text, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
        ornek5();
    }

    private static void ornek7 () throws IOException {
        File dosya = new File("C://Users//sario//Desktop//dosya.txt");
        // uzerine ekleme ornegi, ture olunca ustune ekliyor
        Writer writer = new FileWriter(dosya, false);
        BufferedWriter bWriter = new BufferedWriter(writer);
        bWriter.write("deneme\ndosyanın devamı\nbaşka bilgiler çöişüğ");
        // close yapmazsam yazma işlemini bitirmez
        bWriter.close();
        ornek5();
    }

    private static void ornek6 () throws IOException {
        // stream okuma
        java.io.File file = new File("C://Users//sario//Desktop//dosya.txt");
        FileInputStream stream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(stream, Charset.forName("UTF-8"));
        while ( reader.ready() ) {
            System.err.print((char) reader.read());
        }
        stream.close();
    }

    private static void ornek5 () throws IOException {
//        nonblocking io
//        Path path = Path.of("C:\\dosya\\dosya.txt");
//        String sonuc = java.nio.file.Files.readString(path);
//        System.err.println(sonuc);

//        yukarıdakini tek satırda yazmak istersek
        System.err.println(Files.readString(Path.of(URI.create("file:/C://Users//sario//Desktop//dosya.txt"))));
    }

    private static void ornek4 () throws IOException {
        // try with resources
        java.io.File file = new File(URI.create("file:/C://Users//sario//Desktop//dosya.txt"));
        FileReader reader = new FileReader(file);
        try ( BufferedReader bufferedReader = new BufferedReader(reader) ) {
            while ( bufferedReader.ready() ) {
                System.err.println(bufferedReader.readLine());
            }
        } catch (Exception e) {
        }
    }

    private static void ornek3 () throws IOException {
        java.io.File file = new File(URI.create("file:/C://Users//sario//Desktop//dosya.txt"));
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ( bufferedReader.ready() ) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }

    private static void ornek2 () throws IOException {
        java.io.File file = new File(URI.create("file:/C://Users//sario//Desktop//dosya.txt"));
        FileReader reader = new FileReader(file);
        while ( reader.ready() ) {
            char[] cbuf = new char[ (int) (file.length() / 5) ];
            reader.read(cbuf);
            // System.err.print(cbuf); // ekstra karakter yazabiliyor
            for (int i = 0; i < cbuf.length; i++) {
                if ( (byte) cbuf[ i ] != 0 ) {
                    System.err.print(cbuf[ i ]);
                }
            }
        }
        reader.close();
    }

    private static void ornek1 () throws IOException {
        // uri ile verilebilir
        // java.io.File file = new File("C:\\dosya\\dosya.txt");
        java.io.File file = new File(URI.create("file:/C://Users//sario//Desktop//dosya.txt"));
        // home/numan/Desktop
        FileReader reader = new FileReader(file);
        while ( reader.ready() ) {
            System.err.print((char) reader.read());
        }
        reader.close();
    }
}