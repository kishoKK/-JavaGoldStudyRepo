package interfaceSample;

public class DvdDeck implements ControllPanelIf{
 
	@Override 
	public void play() {
		System.out.println("DVD再生");
	}
	
	@Override 
	public void stop() {
		System.out.println("DVD再生停止");
	}
	
	@Override 
	public void pause() {
		System.out.println("DVD一時停止");
	}
	
	@Override 
	public void forwardFast() {
		System.out.println("DVD早送り");
	}
	
	@Override 
	public void backwordFast() {
		System.out.println("DVD早戻し");
	}
	
}
