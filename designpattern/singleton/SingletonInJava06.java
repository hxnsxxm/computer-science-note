package singleton;

/*
6. 이중 확인 잠금(DCL)

이중 확인 잠금(DCL, Double checked Locking)도 있다.
인스턴스 생성 여부를 싱글톤 패턴 잠금 전에 한 번.
객체를 생성하기 전에 한 번해서, 2번 체크하면 인스턴스가
존재하지 않을 때만 잠금을 걸 수 있기 때문에 앞서 생겼던 문제점을 해결할 수 있다.

-----

volatile01.java
volatile02.java
*/


public class SingletonInJava06 {
	private volatile SingletonInJava06 instance;
	
	private SingletonInJava06() {
		
	}
	
	public SingletonInJava06 getInstance() {
		if (instance == null) {
			synchronized (SingletonInJava06.class) {
				if (instance == null) {
					instance = new SingletonInJava06();
				}
			}
		}
		return instance;
	}
}
