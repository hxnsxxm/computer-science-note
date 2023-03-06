package designpattern;

/*
싱글톤 패턴 생성 여부를 확인하고 싱글톤이 없으면 새로 만들고 있다면 만들어진 인스턴스를 반환한다.

하지만 이 코드는 메소드의 원자성이 결여되어 있다.
멀티스레드 환경에서는 싱글톤 인스턴스를 2개 이상 만들 수 있다.

thread01.java | no synchronized
thread02.java | synchronized
*/

public class SingletonInJava01 {
	private static SingletonInJava01 instance;
	
	private SingletonInJava01() {
		
	}
	
	public static SingletonInJava01 getInstance() {
		if (instance == null) {
			instance = new SingletonInJava01();
		}
		return instance;
	}
}
