import java.util.*;

public class Player {
    String username;
    ArrayList<Monster> monsterList = new ArrayList<>();
    int healthPoints;

    public Player(String username) {
        this.username = username;
    }

    public int attack(int indexOwn) {
        return this.monsterList.get(indexOwn).attack();
    }

    public void populate(int i) {
        while (i != 0) {
            Random rnd = new Random();
            switch (rnd.nextInt(3)) {
                case 0:
                    i--;
                    Monster mummy = new Mummy();
                    this.monsterList.add(mummy);
                    break;
                case 1:
                    i--;
                    Monster werewolf = new Werewolf();
                    this.monsterList.add(werewolf);
                    break;
                case 2:
                    i--;
                    Monster vampire = new Vampire();
                    this.monsterList.add(vampire);
                    break;
            }
        }
    }

    public void displayMonster(){
        System.out.println(this.username + " Monsters:");
        for (int i = 0; i < this.monsterList.size(); i++) {
            if(monsterList.get(i).healthPoints > 0) {
                String[] monster = this.monsterList.get(i).toString().split("@");
                System.out.print(i + " " + monster[0] + " | " + monsterList.get(i).healthPoints + " HP");
                System.out.print("   ");
            }
        }

    }

    public boolean checkVictory(){
        for (int i = 0; i < this.monsterList.size(); i++) {
            if(this.monsterList.get(i).healthPoints > 0){
                return false;
            }
        }
        return true;
    }
}
