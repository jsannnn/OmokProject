package consoleOmok;
import java.util.Scanner;
public class userInterface {
    private omokGame game;
    public userInterface(omokGame game){
        this.game = game;
        game = new omokGame();
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to my app");
        System.out.println("Select game mode: 1.PVP 2.PVC 3.Cheat mode");
        int gameMode = scanner.nextInt();
        scanner.nextLine();
        if(gameMode == 1){
            System.out.println("You selected human vs human");
        }
        else if(gameMode == 2){
            System.out.println("You selected human vs computer");
        }
        else if(gameMode == 3){
            System.out.println("You selected cheat mode");
        }
        else{
            System.out.println("Error, invalid game entry");
        }
    }
}
