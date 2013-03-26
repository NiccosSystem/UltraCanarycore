
public class UltraCanarycoreListener extends PluginListener{

	public int onFoodLevelChange(Player player, int oldFoodLevel, int newFoodLevel) {
		return newFoodLevel >= 18 ? 17 : newFoodLevel;		
	}
	public boolean onCommand(Player p, String[] cmd) {		
		return false;		
	}
}