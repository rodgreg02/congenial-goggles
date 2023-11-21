public abstract class Monster {
    int healthPoints;
    int attackPoints;


    abstract public int attack();
    public int getHit(int attackPoints){
        this.healthPoints = this.healthPoints - attackPoints;
        return this.healthPoints;
    }
}
