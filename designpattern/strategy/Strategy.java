package strategy;

import java.util.ArrayList;
import java.util.List;

/*
전략 패턴

객체의 행위를 바꾸고 싶은 경우 '직접' 수정하지 않고 전략이라고 부르는
'캡슐화한 알고리즘'을 컨텍스트 안에서 바꿔주면서 상호 교체가 가능하게 만드는 패턴
실제 라이브러리로는 인증모듈에 쓰이는 passport (for Node.js)가 있음
*/

interface PaymentStrategy {
	public void pay(int amount);
}

class KAKAOCardStrategy implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public KAKAOCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using KAKAOCard");
	}
}

class LUNACardStrategy implements PaymentStrategy {
	private String emailId;
	private String password;
	
	public LUNACardStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using LUNACard");
	}
}

class Item {
	private String name;
	private int price;
	
	public Item(String name, int cost) {
		this.name = name;
		this.price = cost;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}

class ShoppingCart {
	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public int calculateTotal() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}

public class Strategy {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item A = new Item("kundolA", 100);
		Item B = new Item("hundolB", 300);
		
		cart.addItem(A);
		cart.addItem(B);
		
		//pay by LUNACard
		cart.pay(new LUNACardStrategy("kundol@exmple.com", "pukubababo"));
		
		//pay by KAKAOCart
		cart.pay(new KAKAOCardStrategy("Ju hongchul", "1233456789", "123", "12/01"));
		
	}
}

/*
400 paid using LUNACard
400 paid using KAKAOCard
*/