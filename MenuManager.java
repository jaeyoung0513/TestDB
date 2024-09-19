package package1;

import java.util.Scanner;

public class MenuManager {
	public final static int LOGIN = 1;   
	public final static int EXIT = 2;     
	public final static int SEARCH_ADRESS = 1;   
	public final static int PRINT_ADRESS = 2; 
	public final static int LOGOUT = 3;
	
	public void initMenu() {
		System.out.println("<< 주소록 관리 >>");
		System.out.println("1. 로그인");
		System.out.println("2. 종료");
	}
	
	public void addressMenu() {
		System.out.println("<< 주소록 관리 >>");
		System.out.println("1. 주소록 검색");
		System.out.println("2. 전체 주소록 출력");
		System.out.println("3. 로그아웃");
	}
	
	public int selectInitMenu() {
		Scanner input = new Scanner(System.in);
		int select;
		
		while(true) {
			select = input.nextInt();
			if(select<LOGIN || select>EXIT) {
				System.out.println("메뉴 선택이 잘못되었습니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
		return select;
		
	}
	
	public int selectAddressMenu() {
		Scanner input = new Scanner(System.in);
		int select;
		
		while(true) {
			select = input.nextInt();
			if(select<SEARCH_ADRESS || select>LOGOUT) {
				System.out.println("메뉴 선택이 잘못되었습니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
		
		return select;
		
	}

}
