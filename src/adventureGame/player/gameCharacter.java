package adventureGame.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class gameCharacter {
    private int damage;
    private int health;
    private int money;
}
