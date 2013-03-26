
public class UltraCanarycoreListener extends PluginListener{

	public boolean onHealthChange(Player p, int oldValue, int newValue) {
		return newValue > oldValue ? true : false;
	}
	public boolean onCommand(Player p, String[] cmd) {		
		return false;		
	}
	public boolean onEat(Player p, Item item) {
		if (item.getItemId() == 322) {
			p.setHealth(p.getHealth() + 4);
			return false;
		}
		return false;
	}
}