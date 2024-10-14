package inheritance;

class Login extends Aircon {
	public void display() {
		System.out.println("로그인 기능");
		System.out.println("인증통과");
		super.display();
	}
}

class Aircon {
	public void display() {
		System.out.println("에어컨 동작합니다.");
	}
}

public class Ex10 {
	public static void main(String[] args) {
		Login a = new Login();
//	Aircon air = new Aircon();
//	air.display();
//	Login log= new Login();
//	log.dispaly();
	}
}