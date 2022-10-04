package adventureGame.location.battleLocation;

import adventureGame.location.Location;
import adventureGame.location.battleLocation.monster.Monster;

public abstract  class BattleLocation extends Location {

    Monster monster;

    public BattleLocation(Monster monster){

    }

    public boolean onLocation(){
        return true;
    }

    public void attack(){

    }
}
