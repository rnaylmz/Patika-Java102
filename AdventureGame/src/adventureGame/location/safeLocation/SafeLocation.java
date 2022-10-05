package adventureGame.location.safeLocation;

import adventureGame.location.Location;
import adventureGame.player.Player;

public abstract class SafeLocation extends Location {
    public SafeLocation(Player player, String name) {
        super(player, name);
    }

    public SafeLocation() {
        super();
    }

    public boolean onLocation(){
        return true;
    }
}
