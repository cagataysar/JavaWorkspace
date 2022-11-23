public class Person {
    /**
     * tcNo immutable
     * 1- Değişken private olacak
     * 2- setter metot yazılmayacak
     * 3- değişken final olacak
     * 4- class final olabilir (zorunlu değil)
     */
    private String isim;
    private final String tcNo;

    private final Vehicle vehicle;

    public Person (String tcNo, Vehicle vehicle) {
        this.tcNo = tcNo;
        this.vehicle = vehicle;
    }

    public String getTcNo () {
        return "XXXXXXXXX" + tcNo.substring(tcNo.length() - 3);
    }

    public String getIsim () {
        return isim;
    }

    public void setIsim (String isim) {
//        tcNo = "123";
        this.isim = isim;
    }
}
