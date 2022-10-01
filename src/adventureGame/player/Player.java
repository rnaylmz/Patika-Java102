package adventureGame.player;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String characterName;
    private String name;

    public Player(String playerName) {
        name = playerName;
    }

    public void selectCharacter(){
        System.out.println("Character : Samurai \t Damage : 5 " );
    }
}
