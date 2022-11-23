public class Vehicle {
    private boolean yakitGerekliMi;

    public boolean isYakitGerekliMi () {
        return yakitGerekliMi;
    }

    public void setYakitGerekliMi (boolean yakitGerekliMi) {
        this.yakitGerekliMi = yakitGerekliMi;
    }

    protected void git () {
        if ( yakitGerekliMi ) {
            System.out.println("Gidiyor");
        } else {
            System.out.println("Yakıtım yok");
        }
    }
}
