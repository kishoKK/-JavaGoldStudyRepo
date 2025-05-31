package Chapter1;

public class Factory {

	public Test hello() {
		class Hello implements Test {
			@Override
			public void execute() {
				System.out.println("Hello!!");
			}
			
		}
		return new Hello();
	}
	
	public static Test bye() {
		class Bye implements Test {
			@Override
			public void execute() {
				System.out.println("Bye!!");
			}
		}
		return new Bye();
		
	}
	
}
