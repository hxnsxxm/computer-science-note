
/*
4. 정적 블록

정적 블록을 사용해도 된다.
*/

public class SingletonInJava04 {
	private static SingletonInJava04 instance = null;
	
	static {
		instance = new SingletonInJava04();
	}
	
	private SingletonInJava04() {
		
	}
	
	public static SingletonInJava04 getInstance() {
		return instance;
	}
}