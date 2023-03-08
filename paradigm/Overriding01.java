class Animal {
	public void bark() {
		System.out.println("mumu! mumu!");
	}
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("wal!! wal!!");
	}
}

public class Overriding01 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
	}
}
/*
wal!! wal!!
*/