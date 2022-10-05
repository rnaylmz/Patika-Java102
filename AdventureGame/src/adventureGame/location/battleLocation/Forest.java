package adventureGame.location.battleLocation;

import adventureGame.location.battleLocation.monster.Monster;
import lombok.Data;

@Data
public class Forest extends BattleLocation{


    @Override
    public boolean onLocation() {
        return true;
    }
}
