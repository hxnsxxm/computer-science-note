package singleton;

/*
3. 정적 멤버

정적(static) 멤버나 블록은 런타임이 아니라 최초에 JVM이 클래스 로딩 때 
모든 클래스들을 로드할 때 미리 인스턴스를 생성하는데 이를 이용한 방법이다.

클래스 로딩과 동시에 싱글톤 인스턴스를 만든다. 그렇기 때문에 
모듈들이 싱글톤 인스턴스를 요청할 때 그냥 만들어진 인스턴스를 반환하면 된다.

이는 불필요한 자원낭비라는 문제점이 있다.
싱글톤 인스턴스가 필요없는 경우도 무조건 싱글톤 클래스를 호출해 인스턴스를 만들어야 하기 때문이다.

*/
public class SingletonInJava03 {
	private final static SingletonInJava03 instance = new SingletonInJava03();
	
	private SingletonInJava03() {
		
	}
	
	public static SingletonInJava03 getInstance() {
		return instance;
	}
}
