package package1;

import java.util.Scanner;

public class AddressManager {
	private MenuManager menu = new MenuManager();
	private User[] userList= new User[3];
	private User guest = new User();

	public AddressManager() {
		this.userList[0] = new User("aaa", "5555555", "서울");
		this.userList[1] = new User("bbb", "1111111", "경기");
		this.userList[2] = new User("ccc", "2222222", "부산");
	}

	public void run() {
		boolean end_flag = false;
		while (true) {
			this.menu.initMenu();
			int select = this.menu.selectInitMenu();
			switch (select) {
			case MenuManager.LOGIN:
				if (this.loginProcess()) {
					this.addressProcess();
				}
				break;
			case MenuManager.EXIT:
				end_flag = true;
				break;
			}
			if (end_flag) {
				System.out.println("종료 되었습니다.");
				break;
			}
		}
	}

	public boolean loginProcess() {

		Scanner input = new Scanner(System.in);

		System.out.print("ID: ");
		String id = input.nextLine();
		System.out.print("PW: ");
		String pw = input.nextLine();

		guest.setId(id);
		guest.setPw(pw);

		return true;

	}

	public void addressProcess() {
		boolean end_flag = false;
		while (true) {
			this.menu.addressMenu();
			int select = this.menu.selectAddressMenu();

			switch (select) {
			case MenuManager.SEARCH_ADRESS:
				this.addressSearch();
				break;
			case MenuManager.PRINT_ADRESS:
				for (int i=0; i<userList.length; i++) {
					userList[i].printInfo();
				}

				break;
			case MenuManager.LOGOUT:
				this.guest.logout();
				end_flag = true;
				break;
			}
			if (end_flag) {
				System.out.println("로그아웃 되었습니다.");
				System.out.println("-----------------------------------");
				break;
			}

		}

	}

	public void addressSearch() {
		boolean flag = false;
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("유저의 이름 : ");
			String name = input.nextLine();

			for (int i = 0; i < userList.length; i++) {
				if (this.userList[i].getName().equals(name)) {
					System.out.println(this.userList[i].getName() + "님의 주소: " + this.userList[i].getAddress());
					System.out.println(this.userList[i].getName() + "님의 전화번호: " + this.userList[i].getPhone());
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("입력하신 유저의 이름이 없습니다. 다시 입력해주세요");
				continue;
			}
			if (flag) {
				break;
			}
		}

	}

}
