public class Person {
    //    POJO, plain old Java object, entity

    private String isim;
    private String tcNo;

    public String getTcNo () {
        return "XXXXXXXXX" + tcNo.substring(tcNo.length() - 3);
    }

    public void setTcNo (String tcNo) {
        this.tcNo = tcNo;
    }

    public String getIsim () {
        return isim;
    }

    public void setIsim (String isim) {
        this.isim = isim;
    }
}
