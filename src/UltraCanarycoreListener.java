
public class UltraCanarycoreListener extends PluginListener{

	public boolean onHealthChange(Player p, int oldValue, int newValue) {
		return newValue > oldValue && oldValue > 0 && !p.isDead() ? true : false;
	}
}