/**
 * Abstract yaptım çünkü aslıda oyuncu diye bir şey yok.
 * Hücum ve savunma oyuncusu var.
 */
public abstract class Player {
    private int number;
    private String name;

    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void personalTraining () {

    }
}
