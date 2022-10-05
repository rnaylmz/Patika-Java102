package adventureGame.location.safeLocation;

import adventureGame.player.Player;
public class ToolStore extends SafeLocation{

    public ToolStore(Player player, String name) {

        super(player, "Tool Store");
    }

    public ToolStore() {

    }


    @Override
    public boolean onLocation(){
        System.out.println(" Let's buy something for make your character more stronger ! ");
        return true;
    }

    public void menu(){

    }

    public void buy(){

    }
}
