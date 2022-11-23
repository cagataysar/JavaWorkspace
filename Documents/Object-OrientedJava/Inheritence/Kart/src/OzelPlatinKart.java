public class OzelPlatinKart extends PlatinKart {

    public OzelPlatinKart (String bankaIsmi) {
        super(bankaIsmi);
    }

    public void overrideTest () {
        // super olsa da olmasa da yukarı doğru bulduğu ilk override'ı çalıştırıyor
        super.overrideEdilenMetot();
    }
}
