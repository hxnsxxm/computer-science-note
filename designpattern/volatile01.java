

/*
volatile

메모리 구조는 메인 메모리 위에 CPU 캐시메모리라고 불리느 L3, L2, L1 캐시가 있다
(L4도 드물긴 하지만 L4까지 캐시 메모리라고 부름)

JAVA에서는 스레드 2개가 열리면 변수를 메인 메모리(RAM)으로부터 가져오는 것이 아니라
캐시메모리에서 각각의 캐시메모리를 기반으로 가져온다.

그렇기 때문에 앞의 코드와 같은 변수값 불일치 문제가 발생할 수 있다.
근데 여기서 volatile 키워드를 추가하게 되면 Main Memory를 기반으로 저장하고 일어오기 때문에
이 문제를 해결할 수 있다. 

*/
public class volatile01 {
	boolean flag = true;
	
	public void test() {
		new Thread(() -> {
			int cnt = 0;
			while (flag) {
				cnt++;
			}
			System.out.println("Tread01 finished\n");
		}).start();
		new Thread(() -> {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ignored) {
				
			}
			System.out.println("flag to false\n");
			flag = false;
		}).start();
	}
	
	public static void main(String[] args) {
		new volatile01().test();
	}
}
