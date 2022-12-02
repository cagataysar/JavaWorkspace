/**
 * TIP1 Person!dan extend aldığı için sadece Person veya aşağısı olabilir.
 */
public class Tuple< TIP1 extends Person, TIP2 > {
    private TIP1 key;
    private TIP2 value;

    public Tuple () {
    }

    public Tuple (TIP1 key, TIP2 value) {
        this.key = key;
        this.value = value;
    }

    public void setKey (TIP1 key) {
        this.key = key;
    }

    public void setValue (TIP2 value) {
        this.value = value;
    }

    public TIP1 getKey () {
        return key;
    }

    public TIP2 getValue () {
        return value;
    }
}
