package adventureGame;

import adventureGame.location.Location;
import adventureGame.player.Player;


import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    Player player;
    Location location;

    public void start(){
        System.out.println("Welcome to the Adventure Game");
        System.out.println("Enter your nickname : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " welcome to our adventure world ! ");
        player.selectCharacter();
        player.selectLocation();
    }
}
