package interfaceSample;

public class HDD implements ControllPanelIf {

	@Override 
	public void play() {
		System.out.println("HDD再生");
	}
	
	@Override 
	public void stop() {
		System.out.println("HDD再生停止");
	}
	
	@Override 
	public void pause() {
		System.out.println("HDD一時停止");
	}
	
	@Override 
	public void forwardFast() {
		System.out.println("HDD早送り");
	}
	
	@Override 
	public void backwordFast() {
		System.out.println("HDD早戻し");
	}
	
}
