public class Werewolf extends Monster{
    public Werewolf() {
        this.healthPoints = 450;
        this.attackPoints = 250;
    }

    @Override
    public int attack() {
        return this.attackPoints;
    }
}
