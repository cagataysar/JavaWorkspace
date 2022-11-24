public class LineBacker extends DefensivePlayer {
    @Override
    public void makeTackle () {
        System.out.println("Good tackle from " + super.getName() + ".");
    }
}
