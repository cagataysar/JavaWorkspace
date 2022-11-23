public class KrediKarti extends Kart {
    private int limit;

    public KrediKarti (String bankaIsmi) {
        super(bankaIsmi);
    }

    public int getLimit () {
        return limit;
    }

    public void setLimit (int limit) {
        this.limit = limit;
    }

    @Override
    public void alisverisYap (int miktar) {
        this.limit -= miktar;
    }

    @Override
    public void overrideEdilenMetot () {
        System.out.println("Kredi kartının metodu çalıştı");
    }
}
