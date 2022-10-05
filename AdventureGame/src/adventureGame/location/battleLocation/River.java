package adventureGame.location.battleLocation;

import adventureGame.location.battleLocation.monster.Monster;
import adventureGame.player.Player;
import lombok.Data;

@Data
public class River extends BattleLocation{

    @Override
    public boolean onLocation() {
        return true;
    }
}
