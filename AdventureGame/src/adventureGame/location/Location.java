package adventureGame.location;

import adventureGame.player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Location {

    private Player player;
    private String name;
    public Location(Player player) {
        this.player = player;
    }

    public Location(){
    }
    public abstract boolean onLocation();
}
