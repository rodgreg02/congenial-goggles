public class Mummy extends Monster{
    boolean attack1 = false;
    boolean attack2 = false;
    public Mummy() {
        this.attackPoints = 95;
        this.healthPoints = 200;
    }

    @Override
    public int attack() {
        if(!attack1 || !attack2){
            if (!attack1){
                attack1 = true;
            }else {
                attack2 = true;
            }
            return this.attackPoints;
        }
        else{
            System.out.println("Can't attack, wait until next turn...");
            attack1 = false;
            attack2 = false;
            return 0;
        }
    }
}
