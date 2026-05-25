package homework;

public class Smartphone {
	
	private String number = "010-7229-1338"; // 이준서 학생 번호
	private String telecom = "SKT";
	private int batteryLevel = 70;
	private int availMem = 80;
	private int photoCount = 2;

	public void printInfo() {
		System.out.println("폰 번호: " + number);
		System.out.println("통신사: " + telecom);
		System.out.println("배터리 잔량: " + batteryLevel);
		System.out.println("메모리 잔량: " + availMem);
	}
	
	public void changeTelecom(String newTelecom) {
		boolean flag = false;
		
		if (newTelecom.equals(telecom)) {
			System.out.println("이미 해당 통신사입니다.");
			flag = true;
		} else {
			String[] telecomList = {"SKT", "KT", "LGU"};
			for (int i = 0; i < telecomList.length; i++) {
				if (newTelecom.equals(telecomList[i])) {
					telecom = newTelecom;
					System.out.println("통신사 변경 완료");
					flag = true;
					break;
				}
			}
		}
		if (!flag) {
			System.out.println("존재하지 않는 통신사입니다.");
		}
	}
	
	public void chargeBattery(double h) {
		batteryLevel += 30 * h;
		
		if (batteryLevel > 100) {
			batteryLevel = 100;
		}
		
		System.out.println("현재 배터리 잔량: " + batteryLevel + "%");
	}
	
	public void takePhoto() {
		if (availMem >= 5) {
			availMem -= 5;
			photoCount += 1;
			System.out.println("사진이 저장되었습니다.");
		} else {
			System.out.println("메모리 부족");
		}
	}

	public void deletePhoto() {
		if (photoCount >= 1) {
			availMem += 5;
			photoCount -= 1;
			System.out.println("메모리 증가");	
		} else {
			System.out.println("삭제할 사진이 없습니다.");
		}

	}
	
	public void runApp(double h) {
		batteryLevel -= 10 * h;
		
		if (batteryLevel < 0) {
			batteryLevel = 0;
			System.out.println("배터리가 방전되었습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		Smartphone myPhone = new Smartphone();
		
		System.out.println("--- 초기 스마트폰 상태");
		myPhone.printInfo();
		
		System.out.println("\n--- 사진 촬영 및 삭제");
		myPhone.takePhoto();
		myPhone.takePhoto();
		myPhone.deletePhoto();
		
		System.out.println("\n--- 통신사 변경");
		myPhone.changeTelecom("KT");
		myPhone.changeTelecom("KT"); 
		myPhone.changeTelecom("LG");
		
		System.out.println("\n--- 배터리 충전 및 방전");
		myPhone.chargeBattery(0.8); 
		myPhone.runApp(12.0);      
		
		System.out.println("\n--- 최종 스마트폰 상태");
		myPhone.printInfo();
	}

}
