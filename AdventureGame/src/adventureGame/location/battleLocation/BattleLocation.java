package adventureGame.location.battleLocation;

import adventureGame.location.Location;
import adventureGame.location.battleLocation.monster.Monster;
import adventureGame.player.Player;

public abstract  class BattleLocation extends Location {

    String object;
    Monster monster;
    public BattleLocation(Player player, String name) {
        super(player, name);
    }

    public BattleLocation(Player player) {
        super(player);
    }

    public BattleLocation(){
        super();
    }

    public abstract boolean onLocation();

    public void attack(){

    }
}
