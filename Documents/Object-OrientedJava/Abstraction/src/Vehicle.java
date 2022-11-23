public class Vehicle {
    private int lastikSayisi;
    private boolean lastikHavasi;
    private double benzinMiktari;
/*
    public Vehicle (int lastikSayisi, boolean lastikHavasi, double benzinMiktari) {
        this.lastikSayisi = lastikSayisi;
        this.lastikHavasi = lastikHavasi;
        this.benzinMiktari = benzinMiktari;
    }
*/

    public void git () {
        if ( lastikSayisi != 4 ) {
            System.out.println("4 adet lastik olmalıdır.");
            return;
        }
        if ( ! lastikHavasi ) {
            System.out.println("Lastiklerin havası yok. ");
            return;
        }
        if ( benzinMiktari == 0.0 ) {
            System.out.println("Benzin yoktur. ");
        }
        System.out.println("Araç gidiyor.");
    }

    public int getLastikSayisi () {
        return lastikSayisi;
    }

    public void setLastikSayisi (int lastikSayisi) {
        this.lastikSayisi = lastikSayisi;
    }

    public boolean isLastikHavasi () {
        return lastikHavasi;
    }

    public void setLastikHavasi (boolean lastikHavasi) {
        this.lastikHavasi = lastikHavasi;
    }

    public double getBenzinMiktari () {
        return benzinMiktari;
    }

    public void setBenzinMiktari (double benzinMiktari) {
        this.benzinMiktari = benzinMiktari;
    }
}
