package adventureGame.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class GameCharacter {
    private String characterName;
    private int characterId;
    private int damage;
    private int health;
    private int money;
}
