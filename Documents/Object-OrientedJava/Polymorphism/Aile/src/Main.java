import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ornek1();

    }

    private static void ornek1 () {
        // aynı anda hem anne hem de baba olarak görünüyor
        Cocuk cocuk = new Cocuk();
        if ( cocuk instanceof Anne ) {
            System.err.println("Anneden gelir");
        }
        if ( cocuk instanceof Baba ) {
            System.err.println("Babadan gelir");
        }
        if ( cocuk instanceof FırcaAtabilir ) {
            System.err.println("Baba fırça atıyor");
        }
    }
}