
public class UltraCanarycoreListener extends PluginListener{

	public int onFoodLevelChange(Player player, int oldFoodLevel, int newFoodLevel) {
		
		if (newFoodLevel >= 18) return 17;
			
		return newFoodLevel;	
		
	}
	public boolean onCommand(Player p, String[] cmd) {
		
		
		
		return false;		
	}
}
