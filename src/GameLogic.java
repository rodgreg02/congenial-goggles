import java.util.Scanner;

public class GameLogic {
    static public void startGame(){
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 username:");
        Player player1 = new Player(scanner.next());
        scanner.reset();
        System.out.println("Player 2 username:");
        Player player2 = new Player((scanner.next()));
        System.out.println("How many monster do you wanna play with?");
        scanner.reset();
        int monsterSize = scanner.nextInt();
        player1.populate(monsterSize);
        player2.populate(monsterSize);
        while(!gameOver){
            System.out.print("\033[H\033[2J");
            //Player 1
            player1.displayMonster();
            scanner.reset();
            System.out.println("\nWhat monster do you wanna attack with?");
            int indexChoiceOwn = scanner.nextInt();
            player2.displayMonster();
            System.out.println("\nWhat monster do you wish to attack?");
            scanner.reset();
            int indexChoiceEnemy = scanner.nextInt();
            player2.monsterList.get(indexChoiceEnemy).getHit(player1.attack(indexChoiceOwn));

            if( player1.checkVictory() || player2.checkVictory()){
                System.out.println("Game over!");
                gameOver = true;
            }

            //Player 2
            System.out.print("\033[H\033[2J");
            player2.displayMonster();
            System.out.println("\nWhat monster do you wanna attack with?");
            indexChoiceOwn = scanner.nextInt();
            player1.displayMonster();
            System.out.println("\nWhat monster do you wish to attack?");
            scanner.reset();
            indexChoiceEnemy = scanner.nextInt();
            player1.monsterList.get(indexChoiceEnemy).getHit(player2.attack(indexChoiceOwn));

           if( player1.checkVictory() || player2.checkVictory()){
                System.out.println("Game over!");
               gameOver = true;
            }
        }
    }
}
