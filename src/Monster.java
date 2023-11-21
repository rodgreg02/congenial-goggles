public abstract class Monster {
    int healthPoints;
    int attackPoints;
    boolean alive;

    abstract public int attack();
    public int getHit(int attackPoints){
        this.healthPoints = this.healthPoints - attackPoints;
        if(this.healthPoints <= 0){
            this.alive = false;
        }
        return this.healthPoints;
    }
}
