package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

import KimYoungJu.humditiyClass;
import mainPackage.NaWaterRid;
import 가동종료.Ex01;
import 박소담.Mode_sodam;
import 허은미.Mode;

class LoginDTO03 {
	private String id;
	private String pwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

class LoginService03 extends air {
	private LoginDTO03 dto;

	public LoginService03() {
		dto = new LoginDTO03();
	}

	public void display() {
		boolean login = false;
		ArrayList<String> arrid = new ArrayList<String>();
		ArrayList<String> arrpwd = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 탈퇴\n4. 전체 회원 보기\n5. 종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				if (arrid.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");
				else {
					System.out.print("아이디 입력 : ");
					dto.setId(sc.next());
					if (!arrid.contains(dto.getId()))
						System.out.println("존재하지 않은 id입니다.");

					else {
						System.out.print("비밀번호 입력 : ");
						dto.setPwd(sc.next());
						if (!arrpwd.contains(dto.getPwd()))
							System.out.println("비밀번호가 틀렸습니다.");

						else {
							System.out.println("인증통과");
							login = true;
						}
					}
				}
				break;
			case 2:
				System.out.print("아이디 입력 : ");
				dto.setId(sc.next());
				if (arrid.contains(dto.getId()))
					System.out.println("사용자가 존재합니다. 탈퇴 후 진행하세요!!!");

				else {
					System.out.print("비밀번호 입력 : ");
					dto.setPwd(sc.next());
					arrid.add(dto.getId());
					arrpwd.add(dto.getPwd());
					System.out.println("축하합니다. 회원가입이 완료되었습니다.");
				}
				break;
			case 3:
				if (arrid.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					System.out.print("삭제할 아이디 입력 : ");
					dto.setId(sc.next());
					if (arrid.contains(dto.getId())) {
						int num = arrid.indexOf(dto.getId());
						arrid.remove(num);
						arrpwd.remove(num);
						System.out.println("회원탈퇴가 완료되었습니다.");
					}

					else
						System.out.println("해당 아이디는 존재하지 않습니다.");
				}
				break;
			case 4:
				if (arrid.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					for (int i = 0; i < arrid.size(); i++) {
						System.out.println("아이디 : " + arrid.get(i) + ", 비밀번호 : " + arrpwd.get(i));
					}
				}
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
			if (login)
				break;
		}

		if (login)
			super.display();
	}
}

class air {
	public void display() {
		Scanner input = new Scanner(System.in);
		NaWaterRid na = new NaWaterRid();
		Mode mo = new Mode();
		Mode_sodam sd = new Mode_sodam();
		Ex01 e = new Ex01();
		humditiyClass h = new humditiyClass();
		// 전원
		// 제습 / 가습 설정
		// 습도 인식 및 세기 조절
		// 물통 교체 알람
		// 파워 모드, 절전모드, 수면모드 or 자동 수동

		boolean power = true;
		while (true) {
			power = e.전원();
			while (power) {
				System.out.println("[1] 제습&가습 설정");
				System.out.println("[2] 현재 습도 및 풍량");
				System.out.println("[3] 물통 교체");
				System.out.println("[4] 모드 설정");
				System.out.println("[5] 가동 종료");
				System.out.print(">>>");
				int menu = input.nextInt();

				switch (menu) {
				case 1:
					sd.display(); // 제습&가습 설정 (박소담)
					break;
				case 2: // 습도 인식 및 세기 조절 (김영주)
					System.out.println(String.format("현재의 습도에 맞춰 %d단계로 조절합니다.", h.SetWindPower()));

					break;
				case 3:// 물통 교체 (나호영)
					na.lidwater(120);
					break;
				case 4:// 파워모드, 절전모드,수면모드 or 자동 수동 (허은미)
					mo.display();
					break;
				case 5: // 시작 및 종료(방준혁)
					power = false;
					break;
				default: // 다른 값 입력
					System.err.println("오류");

				}
			}
		}
	}
}

public class Quiz {
	public static void main(String[] args) {
		LoginService03 login = new LoginService03();
		login.display();

	}
}