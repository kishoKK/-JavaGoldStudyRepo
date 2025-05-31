package Chapter1;

public class FactoryTest {

	public static void main(String[] args) {

		//helloメソッドはstaticではないためインスタンス化する必要がある
		Factory ft = new Factory();
		ft.hello().execute();
		//byeメソッドはstaticであるため、直接参照可能
		Factory.bye().execute();
		
	}

}
 