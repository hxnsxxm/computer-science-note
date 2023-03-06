
/*
2. Synchronized

인스턴스를 반환하기 전까지 격리 공간에 놓기 위해 synchronized 키워드로
잠금을 할 수 있다. 최초로 접근한 스레드가 해당 메소드 호출시에 다른 스레드가
접근하지 못하도록 잠금(lock)을 걸어준다.

이때 getInstance() 메소드를 호출할 때마다 lock이 걸려 성능저하가 발생한다.

인스턴스가 만들어졌는데도 getInstance() 는 호출이 가능하니 해당부분도 좋지 ㅇ낳다.

*/
public class Singleton02 {
	private static Singleton02 instance;
	
	private Singleton02() {}
	
	public static synchronized Singleton02 getInstance() {
		if (instance == null) {
			instance = new Singleton02();
		}
		return instance;
	}
}
