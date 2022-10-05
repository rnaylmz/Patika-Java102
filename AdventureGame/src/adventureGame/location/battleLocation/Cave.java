package adventureGame.location.battleLocation;

import adventureGame.location.battleLocation.monster.Monster;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Cave extends BattleLocation{


    @Override
    public boolean onLocation() {
        return true;
    }
}
