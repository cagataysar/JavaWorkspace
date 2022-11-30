import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main (String[] args) {
        try {
            ornek1();
        } catch (MyCheckedException | FileNotFoundException e) {
        }
        ornek2();
    }

    private static void ornek2 () throws MyUncheckedException {
        throw new MyUncheckedException("Hata oluştu");
    }

    private static void ornek1 () throws MyCheckedException, FileNotFoundException {
        Person p = new Person();
        p.yas = 110;
        if ( p.yas > 100 ) {
            throw new MyCheckedException("Yaş 100'den büyük olamaz.");
        }
        FileReader reader = new FileReader("C://text.txt");
    }
}

class MyCheckedException extends Exception {
    public MyCheckedException (String message) {
        super(message);
    }
}

class MyUncheckedException extends RuntimeException {
    // RuntimeException'dan kalıtım alıyorsam throw yazmak zorunda değilim
    // try-catch'e de almak zorunda değilim
    // Önemli olan RuntimeException'dan extends alması.
    public MyUncheckedException (String message) {
        super(message);
    }
}

class Person {
    public int yas;
}