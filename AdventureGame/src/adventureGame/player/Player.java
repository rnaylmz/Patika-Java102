package adventureGame.player;


import adventureGame.location.Location;
import adventureGame.location.battleLocation.Cave;
import adventureGame.location.battleLocation.Forest;
import adventureGame.location.battleLocation.River;
import adventureGame.location.safeLocation.SafeHouse;
import adventureGame.location.safeLocation.SafeLocation;
import adventureGame.location.safeLocation.ToolStore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private int damage;
    private int health;
    private int money;
    private Inventory inventory;
    private GameCharacter gameCharacter;
    private String characterName;
    private Scanner input = new Scanner(System.in);
    private String name;

    public Player(String playerName) {
        name = playerName;
    }

    public void selectCharacter() {
        GameCharacter[] charList = {new Samurai(), new Archer(), new Knight()};

        for (GameCharacter gameCharacter : charList) {
            System.out.println("Character :  " + gameCharacter.getCharacterName() +
                    "\t\t ID : " + gameCharacter.getCharacterId() +
                    " \t\t Damage : " + gameCharacter.getDamage() +
                    "\t\t Health : " + gameCharacter.getHealth() +
                    "\t\t Money : " + gameCharacter.getMoney());
        }

        System.out.println(" Select a character for attack to your enemies : ");

        int selectCharacterWithID = input.nextInt();

        switch (selectCharacterWithID) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }

        //TODO Check how you can write it as like the code below. Because it has given NullPointException.
     /*   if (selectCharacterWithID == gameCharacter.getCharacterId()) {
            System.out.println("You have selected " + gameCharacter.getCharacterName());
        }*/

        System.out.println("Your selecting character is " + this.getCharacterName());
    }

    public void selectLocation(){
        Location [] charList = {new SafeHouse(), new ToolStore(), new Cave(), new Forest(), new River()};

        for(Location location : charList){
            System.out.println(" Location Name : " + location.getName());
        }

        int selectLocationWithID = input.nextInt();
        switch (selectLocationWithID){
            case (1): new SafeHouse();
            case (2): new ToolStore();
            case (3): new Cave();
            case (4): new Forest();
            case (5): new River();
            default: new SafeHouse();
        }

        System.out.println(" Your selected location is " );

    }
    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharacterName(gameCharacter.getCharacterName());
    }

}
