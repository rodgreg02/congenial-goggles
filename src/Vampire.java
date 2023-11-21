import java.util.Random;

public class Vampire extends Monster{
    public Vampire() {
        this.healthPoints = 550;
        this.attackPoints = 150;
        this.alive = true;
    }

    @Override
    public int attack() {
        Random rnd = new Random();
        switch (rnd.nextInt(2)){
            case 0:
                this.healthPoints += 100;
                break;
            case 1:
                break;
        }
        return this.attackPoints;
    }
}
