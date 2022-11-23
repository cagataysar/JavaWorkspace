public class PlatinKart extends KrediKarti {
    public PlatinKart (String bankaIsmi) {
        super(bankaIsmi);
        setLimit(20_000);
    }

    public void ozelMusteri () {
        System.out.println("özel müşteri");
    }

   /* @Override
    public void overrideEdilenMetot () {
        System.out.println("Platin kart çalıştı");
    }*/
}
