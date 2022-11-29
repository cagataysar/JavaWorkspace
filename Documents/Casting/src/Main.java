import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
//        castOrnek1();
//        castOrnek2();
//        castOrnek3();
//        castOrnek4();
    }

    private static void castOrnek4 () {
        Kart kart = getCard(2);
        if ( kart instanceof PlatinKart ) {
            PlatinKart platinKart = (PlatinKart) kart;
            platinKart.platinKartaOzelMetot();
        } else if ( kart instanceof KrediKarti ) {
            KrediKarti krediKarti = (KrediKarti) kart;
            krediKarti.krediKartiOzelMetot();
        } else if ( kart instanceof BankaKarti ) {
            BankaKarti bankaKarti = (BankaKarti) kart;
            bankaKarti.bankaKartaOzelMetot();
        } else {
            kart.anaKartaOzelMetot();
        }
    }

    private static Kart getCard (int i) {
        if ( i == 1 ) {
            return new Kart();
        }
        if ( i == 2 ) {
            return new BankaKarti();
        }
        if ( i == 3 ) {
            return new KrediKarti();
        }
        if ( i == 4 ) {
            return new PlatinKart();
        }
        return null;
    }

    private static void castOrnek3 () {
        Kart anakart = new Kart();
        BankaKarti bankaKarti = new BankaKarti();
        KrediKarti krediKarti = new KrediKarti();
        PlatinKart platinKart = new PlatinKart();
        doStuff(anakart);
        //doStuff(bankaKarti);
        //doStuff(krediKarti);
        //doStuff(platinKart);
        //Kart yeniKart = new KrediKarti();
        //doStuff(yeniKart);
    }

    private static void doStuff (Kart kart) {
        if ( kart instanceof PlatinKart ) {
            PlatinKart platinKart = (PlatinKart) kart;
            platinKart.platinKartaOzelMetot();
        } else if ( kart instanceof KrediKarti ) {
            KrediKarti krediKarti = (KrediKarti) kart;
            krediKarti.krediKartiOzelMetot();
        } else if ( kart instanceof BankaKarti ) {
            BankaKarti bankaKarti = (BankaKarti) kart;
            bankaKarti.bankaKartaOzelMetot();
        } else {
            kart.anaKartaOzelMetot();
        }
    }

    private static void castOrnek2 () {
        // mantiksiz ornekler
        Kart anakart = new Kart();
        BankaKarti bankaKarti = new BankaKarti();
        KrediKarti krediKarti = new KrediKarti();
        PlatinKart platinKart = new PlatinKart();
//        Cannot cast from KrediKarti to BankaKarti
//        bankaKarti = (BankaKarti) krediKarti; // java.lang.ClassCastException, runtime anında
//        bankaKarti = (BankaKarti) anakart;
//        anakart = platinKart;
//        krediKarti = platinKart;
//        ((PlatinKart) krediKarti).platinKartaOzelMetot();
//        ((KrediKarti) platinKart).krediKartiOzelMetot();
    }

    private static void castOrnek1 () {
        List< String > liste = new ArrayList<>();
        ArrayList< String > liste2 = (ArrayList< String >) liste;
//        System.out.println(liste2);

        /*
        List< String > liste = new LinkedList<>(); //ClassCastException
        ArrayList< String > liste2 = (ArrayList< String >) liste;
//        System.out.println(liste2);
        */

        AbstractList< String > liste3 = new ArrayList<>();
        ArrayList< String > liste4 = (ArrayList< String >) liste3;
//        System.out.println(liste);

        ArrayList< String > liste5 = new ArrayList<>();
        // cast 'e ihtiyaç yok
        List< String > liste6 = liste5;
//        System.out.println(liste6);
    }
}
