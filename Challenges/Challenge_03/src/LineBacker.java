public class LineBacker extends DefensivePlayer {
    @Override
    public void makeTackleToBall () {
        System.out.println("Good tackle from " + super.getName() + ".");
    }
}
