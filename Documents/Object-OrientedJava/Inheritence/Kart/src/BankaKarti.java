import java.util.ArrayList;

public class BankaKarti extends Kart {
    private int bakiye;

    public BankaKarti (String bankaIsmi) {
        super(bankaIsmi);
    }

    @Override
    public String toString () {
        return "Bu bir banka kartıdır.";
    }

    public int getBakiye () {
        return bakiye;
    }

    public void setBakiye (int bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public void alisverisYap (int miktar) {
        this.bakiye -= miktar;
    }
}
