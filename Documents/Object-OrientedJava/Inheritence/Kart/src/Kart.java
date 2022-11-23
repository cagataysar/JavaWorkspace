public class Kart //extends Object
{
    private String sifre;
    private final String bankaIsmi;

    public Kart (String bankaIsmi) {
        this.bankaIsmi = bankaIsmi;
    }

    public String getSifre () {
        return sifre;
    }

    public void setSifre (String sifre) {
        this.sifre = sifre;
    }

    public void alisverisYap (int miktar) {
        System.out.println("Kart ile alışveriş yapılamaz!");
    }

    public void overrideEdilenMetot () {
        System.out.println("Kart sınıfının metodu çalıştı");
    }
}
