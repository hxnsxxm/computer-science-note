

/*
5. 정적 멤버와 Lazy Holder (중첩 클래스)

singleInstanceHolder라는 내부클래스를 하나 더 만듦으로써
Singleton 클래스가 최초에 로딩되더라도 함께 초기화가 되지 않고,
getInstance()가 호출될 때 singleInstanceHolder 클래스가
로딩되어 인스턴스를 생성하게 된다.
*/

public class SingletonInJava05 {
	private static class singleInstanceHolder {
		private static final SingletonInJava05 INSTANCE = new SingletonInJava05();
	}
	
	public static SingletonInJava05 getInstance() {
		return singleInstanceHolder.INSTANCE;
	}
}
