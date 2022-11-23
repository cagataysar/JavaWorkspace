import java.util.Random;

public class InheritenceMain {
    public static void main (String[] args) {
//        BankaKarti bKart = new BankaKarti("dadsa");
//        KrediKarti kKart = new KrediKarti("adsda");
//        bKart.alisverisYap(10);
//        kKart.alisverisYap(10);
//        System.out.println(bKart.toString());

//        instanceOfOrnek1();
//        kendisiVeAsagisi();
        superTest();


    }

    private static void superTest () {
//        new OzelPlatinKart("kfhske").overrideEdilenMetot();
        new OzelPlatinKart("sgsjd").overrideTest();
    }

    private static void kendisiVeAsagisi () {
        doStuff(new KrediKarti("sjgfas"));
        doStuff(new PlatinKart("asjgf"));
//        doStuff(new Kart("asgfhs") );
//        doStuff(new BankaKarti("asgfhs") );
    }

    public static void doStuff (KrediKarti kart) {
        if ( kart.getClass() == PlatinKart.class ) {
            ((PlatinKart) kart).ozelMusteri();
        }
    }

    /**
     * instanceof kullanılırken sıra çok önemli
     */
    private static void instanceOfOrnek1 () {
        Kart kart = null;
//        kart = new BankaKarti("kfhsjk");
//        kart = new KrediKarti("kfhsjk");
//        kart = new Kart("wfhsfkj");
        if ( kart instanceof BankaKarti ) {
            System.out.println("Kart bir banka kartıdır.");
        } else if ( kart instanceof KrediKarti ) {
            System.out.println("Kart bir kredi kartıdır.");
        } else {
            System.out.println("Kart bir karttır.");
        }
    }
}
