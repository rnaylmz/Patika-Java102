package adventureGame.location.safeLocation;

import adventureGame.player.Player;

public class SafeHouse extends SafeLocation {

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    public SafeHouse() {
        super();
    }

    @Override
   public boolean onLocation(){
        System.out.println("In Safe House, your health is regenerated.");
        return true;
    }
}
