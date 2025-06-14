package interfaceSample;

public class BlueDeck implements ControllPanelIf {

	@Override 
	public void play() {
		System.out.println("BlueRay再生");
	}
	
	@Override 
	public void stop() {
		System.out.println("BlueRay再生停止");
	}
	
	@Override 
	public void pause() {
		System.out.println("BlueRay一時停止");
	}
	
	@Override 
	public void forwardFast() {
		System.out.println("BlueRay早送り");
	}
	
	@Override 
	public void backwordFast() {
		System.out.println("BlueRay早戻し");
	}
	
}
