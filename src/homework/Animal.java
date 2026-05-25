package homework;

public class Animal {
	
	protected String name;
	protected int hunger;
	
	public Animal(String name) {
		this.name = name;
		this.hunger = 100;
	}
	
	public void eat(int amount) {
		System.out.println(this.name + "(이)가 밥을 먹습니다.");
		
		this.hunger -= amount;
		
		if (this.hunger <= 0) {
			this.hunger = 0;
		}
	}
	
}
