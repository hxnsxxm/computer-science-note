package singleton;

/*
7. enum

enum의 인스턴스는 기본적으로 스레드세이프(thread safe)한 점이 보장되기 때문에 
이를 통해서 생성할 수 있다.

-----

최고의 방법은?

5번과 7번을 추천한다.
5번은 가장 많이 쓰인다고 알려져 있고,
7번은 이펙티브 자바를 쓴 조슈아 블로크가 추천한 방법이다.

A single-element enum type is the best way to implement a singleton
-   Joshua Bloch, Effective Java 2nd Edition p.18
*/

public enum SingletonInJava07 {
	INSTANCE;
	
	public void oortCloud() {
		
	}
}
