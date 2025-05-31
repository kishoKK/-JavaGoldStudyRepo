package Chapter7;

public class Main {

	public static void main(String[] args) {
		
		//匿名クラス
		var sample = new Sample(10) {
		
		    public void modify(int num) {
		    	setNum(num);
		    }
		    
		};

		sample.modify(150);
		System.out.println(sample.getNum()); // 150
		
	}

}
