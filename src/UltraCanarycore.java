
public class UltraCanarycore extends Plugin{
	
	private UltraCanarycoreListener listener = new UltraCanarycoreListener();
	
	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		
	}
	
	public void initialize() {
		etc.getLoader().addListener(PluginLoader.Hook.HEALTH_CHANGE, this.listener, this, PluginListener.Priority.MEDIUM);
		etc.getLoader().addListener(PluginLoader.Hook.COMMAND, this.listener, this, PluginListener.Priority.MEDIUM);
		etc.getLoader().addListener(PluginLoader.Hook.EAT, this.listener, this, PluginListener.Priority.MEDIUM);
	}

}
