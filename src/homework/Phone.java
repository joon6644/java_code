package homework;

public class Phone {

	String number = "010-1234-4321";
	Boolean battery_is_full = false;
	
	public void show_phone_number() {
		System.out.println("폰번호는 " + number);
	}
	
	public void recharge() {
		if (battery_is_full) {
			System.out.println("이미 배터리가 충전되어 있습니다.");
		} else {
			System.out.println("충전중입니다.");
			battery_is_full = true;
		}
	}
		
	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		Phone p = new Phone();
		
		p.show_phone_number();
		p.recharge();
		p.recharge();
	}

}
