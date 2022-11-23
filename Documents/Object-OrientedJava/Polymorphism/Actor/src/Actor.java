public class Actor {
    public void act (Senaryo senaryo) {
        // dependency injection
        // hangi implementasyonu verirsem o çalışır
        senaryo.act();
    }
}
