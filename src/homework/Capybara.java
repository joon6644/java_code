package homework;

public class Capybara {
	
	private String name;
	private int hunger; // 배고픔 지수
	private int happiness; // 기분 지수
	
	public Capybara(String name) { // 카피바라
		this.name = name;
		this.hunger = (int) (Math.random() * 100 + 1);
		this.happiness = (int) (Math.random() * 100 + 1);
	}
	
	public void roamAround(double hour) { // 돌아다니기 (배고픔 상승)
		System.out.println(this.name + "(이)가 " + hour + "시간 동안 돌아다닙니다.");
		this.hunger += (int) (hour * 40);
		
		if (this.hunger >= 100) {
			this.hunger = 100;
		}
	}
	
	public void eatGrass(int amount) { // 풀 먹기 (배고픔 감소, 기분 상승)
		System.out.println(this.name + "(이)가 풀을 " + amount + "만큼 먹습니다.");
		this.hunger -= amount;
		this.happiness += amount;
		
		if (this.hunger <= 0) {
			this.hunger = 0;
			this.happiness -= 20;
			System.out.println(this.name + "(이)가 너무 배불러서 기분이 안좋아졌습니다.");
		}
		if (this.happiness >= 100) {
			this.happiness = 100;
		}
	}
	
	public void meetDog() { // 개 마주치기 (기분 감소)
		System.out.println(this.name + "(이)가 개를 마주쳤습니다.");
		this.happiness -= 40;
		
		if (this.happiness <= 0) {
			this.happiness = 0;
		}
	}
	
	public void printStatus() {
		System.out.println("\n카피바라 " + name + "(이)의 상태 ==================");
		System.out.println("배고픔 지수: " + hunger + "/100 (높을수록 배고픔)");
		System.out.println("기분 지수: " + happiness + "/100 (높을수록 행복)\n");
	}
	
	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		Capybara c1 = new Capybara("윌리엄");
		
		c1.printStatus();
		c1.eatGrass(60);
		c1.roamAround(0.7);
		c1.meetDog();
		c1.printStatus();
	}
}
